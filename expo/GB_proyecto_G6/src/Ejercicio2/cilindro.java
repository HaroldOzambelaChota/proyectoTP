package Ejercicio2;

/**
 *
 * @author HAROLD
 */
public class cilindro {
    //declarar atributo
    private double altura;
    private double radio;
   
    public cilindro() {
        
    }
    // Constructor que usaremos
    public cilindro(double altura, double radio) {
        //inicializa las variables
        this.altura = altura;
        this.radio = radio;
    }
    //metodo de clase
    public double area(){//calcular area
        double areaLateral;
        double areaBase;

        areaLateral= 2*(Math.PI)*radio*altura;
        areaBase=(Math.PI)*Math.pow(radio, 2);//exponente
        
        return areaLateral+(2*areaBase);
    }
    public double volumen(){//calcula volumen
        double areaBase;
        areaBase=(Math.PI)*(Math.pow(radio, 2));//exponente
        
        return areaBase*this.altura;
    }

    
    
}
