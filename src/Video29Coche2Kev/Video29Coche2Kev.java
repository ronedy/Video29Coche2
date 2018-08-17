/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video29Coche2Kev;

import javax.swing.JOptionPane;

/**
 *
 * @author HP ENVY
 */
public class Video29Coche2Kev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Coche2 y = new Coche2();
        
        // y.ruedas = 7; // Cuando ponemos en privadas las variables no puedos modificarla desde aqui
         
        JOptionPane.showMessageDialog(null,"Caracteristicas de automovil");
        
        System.out.println("Caracteristicas de automovil");
        
        System.out.println();
        
        System.out.println("El automovil tiene " + y.ancho + "CM de ancho" );
        
        System.out.println("El automovil tiene " + y.largo + "CM de largo" );
        
        System.out.println("El automovil tiene " + y.motor + " Caballos de fuerza" );
        
        System.out.println("El automovil tiene " + y.peso + " Kg de peso" );
        
        System.out.println("El automovil tiene " + y.ruedas + " Ruedas" );
        
    }
    
}
