package Ejercicio2;

/**
 *
 * @author HAROLD
 */
public class cilindro {

    private double altura;
    private double radio;

    public cilindro() {
        
    }

    public cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }
    
    public double area(){
        double areaLateral;
        double areaBase;

        areaLateral= 2*(Math.PI)*radio*altura;
        areaBase=(Math.PI)*Math.pow(radio, 2);
        
        return areaLateral+(2*areaBase);
    }
    public double volumen(){
        double areaBase;
        areaBase=(Math.PI)*(Math.pow(radio, 2));
        
        return areaBase*this.altura;
    }

    
    
}
