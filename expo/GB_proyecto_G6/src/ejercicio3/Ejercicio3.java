package ejercicio3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author PONCE
 */
public class Ejercicio3 extends javax.swing.JFrame {
    //Se declara variables
    final int MAX = 10;
    int[] Vectores = new int[MAX];
    int contadores = 0;
    int Num01, Num02, Posicion;

    public Ejercicio3() {
        initComponents();//colores y dimensiones, centrado
        setSize(500, 500);
        this.setTitle("Arreglo de numeros");
        this.setLocationRelativeTo(null);//centrar pantalla
        txtContador.setText("[" + (contadores) + "]");
        txtContador.setEditable(false);
        desahabilitar();
    }

    void desahabilitar() {//desabilida algunos botones y caja de texto
        btnMOSTRAR.setEnabled(false);
        btnREINICIAR.setEnabled(true);
        txtNum02.setEnabled(false);
        txtPosicion.setEnabled(false);
    }

    void habilitar() {//habilita algunos botones y caja de texto
        btnMOSTRAR.setEnabled(true);
        btnREINICIAR.setEnabled(true);
        txtNum02.setEnabled(true);
        txtPosicion.setEnabled(true);
    }

    int leerNumeroUno() {//devuelve el numero ingresado
        return Integer.parseInt(txtNum01.getText());
    }

    int leerNumeroDos() {//devuelve un numero para su posterior ingreso
        return Integer.parseInt(txtNum02.getText());
    }

    int leerPosicion() {//devuelve la posicion para ingresar
        return Integer.parseInt(txtPosicion.getText());
    }

    void imprimir(String cadena) {//imprime la cadena en su area de texto
        txtResultados.append(cadena);
    }

    public void reiniciar() {//reinicia todas las variables a cero
        contadores = 0;
        Posicion = 0;
        txtNum01.setText("");
        txtNum02.setText("");
        txtPosicion.setText("");
        txtContador.setText("");
        txtResultados.setText("");
        btnPROCESAR.setEnabled(true);
        txtNum01.setEnabled(true);
        desahabilitar();
        for (int i = 0; i < Vectores.length; i++) {
            Vectores[i] = 0;
        }
    }

    public void procesamiento() {//ingresar elementos al arreglo
        Num01 = leerNumeroUno();
        Vectores[contadores] = Num01;
        txtResultados.setText("");
        imprimir(Arrays.toString(Vectores));
        contadores++;
        txtContador.setText("[" + (contadores) + "]");
        
        if (contadores > 7) {
            txtNum01.setEnabled(false);
            habilitar();
            btnPROCESAR.setEnabled(false);
        }
    }

    public void CambiarPosicion(int num02, int posicion) {//cambia la posicion desplazando a la derecha los elementos
        int i;
        for (i = Vectores.length - 1; i >= posicion; i--) {
            Vectores[i] = Vectores[i - 1];

        }
        //coloca en su espacio respectivo
        Vectores[i] = num02;
        contadores++;
        txtContador.setText("[" + (contadores) + "]");
    }

    String validar1() {//validar caja de posicion y el numero al insertar
        if (txtPosicion.getText().equals("")) {
            return "ingrese posicion";
        } else if (txtNum02.getText().equals("") || txtPosicion.getText().equals("")) {
            return "ingrese numero";
        } else {
            return "";
        }
    }

    String validar() {//valida la primera caja de texto
        if (txtNum01.getText().equals("")) {
            return "ingrese numero";
        } else {
            return "";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNum01 = new javax.swing.JTextField();
        txtContador = new javax.swing.JTextField();
        txtNum02 = new javax.swing.JTextField();
        txtPosicion = new javax.swing.JTextField();
        btnPROCESAR = new javax.swing.JButton();
        btnMOSTRAR = new javax.swing.JButton();
        btnREINICIAR = new javax.swing.JButton();
        btnSALIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 2));

        txtNum01.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Numero:"));
        jPanel2.add(txtNum01);

        txtContador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Contador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.add(txtContador);

        txtNum02.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserta Numero(2):"));
        jPanel2.add(txtNum02);

        txtPosicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Posicion:"));
        jPanel2.add(txtPosicion);

        btnPROCESAR.setText("PROCESAR");
        btnPROCESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROCESARActionPerformed(evt);
            }
        });
        jPanel2.add(btnPROCESAR);

        btnMOSTRAR.setText("MOSTRAR");
        btnMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMOSTRARActionPerformed(evt);
            }
        });
        jPanel2.add(btnMOSTRAR);

        btnREINICIAR.setText("REINICIAR");
        btnREINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREINICIARActionPerformed(evt);
            }
        });
        jPanel2.add(btnREINICIAR);

        btnSALIR.setText("SALIR");
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
        jPanel2.add(btnSALIR);

        jPanel1.add(jPanel2);

        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        jScrollPane1.setViewportView(txtResultados);

        jPanel1.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPROCESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROCESARActionPerformed
        if (validar().equals("")) {//verifica que se haya ingresado los valores y hace el proceso
            procesamiento();
            txtNum01.setText("");
            txtNum01.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, validar());
        }
    }//GEN-LAST:event_btnPROCESARActionPerformed

    private void btnMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMOSTRARActionPerformed
        if (validar1().equals("")) {
            //se llama a la posicio y el numero a insertar en el arreglo
            Num02 = leerNumeroDos();
            Posicion = leerPosicion();
            CambiarPosicion(Num02, Posicion);
            imprimir("\nEl numero " + Num02 + " con la posicion [" + Posicion + "] fue introducido con exito!");
            imprimir("\n" + Arrays.toString(Vectores));
            txtNum02.setText("");
            txtPosicion.setText("");
            txtNum02.requestFocus();
            if (contadores == 10) {// una vez lleno el arreglo se desactiva
                desahabilitar();
            }
        } else {
            JOptionPane.showMessageDialog(null, validar1());
        }

    }//GEN-LAST:event_btnMOSTRARActionPerformed

    private void btnREINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREINICIARActionPerformed
        reiniciar();//variables a cero

    }//GEN-LAST:event_btnREINICIARActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        System.exit(0);//salir 
        
    }//GEN-LAST:event_btnSALIRActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMOSTRAR;
    private javax.swing.JButton btnPROCESAR;
    private javax.swing.JButton btnREINICIAR;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtContador;
    private javax.swing.JTextField txtNum01;
    private javax.swing.JTextField txtNum02;
    private javax.swing.JTextField txtPosicion;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
