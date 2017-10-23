package boletin3_1;
/*
 * @author Arturo
 */
public class Boletin3_1 {

    public static void main(String[] args) {
        Coche coche1= new Coche(); //Creamos un objeto coche1
        //Visualizamos la velocidad
        System.out.println("Valocidad = "+coche1.getVelocidade());
        //Aumentamos la velocidad
        coche1.acelerar(150);
        //Visualizamos
        System.out.println("Valocidad = "+coche1.getVelocidade());
        //Disminuimos la velocidad
        coche1.frenar(50);
        //Visualizamos
        System.out.println("Valocidad = "+coche1.getVelocidade());
        
        
        
    }
    
}
