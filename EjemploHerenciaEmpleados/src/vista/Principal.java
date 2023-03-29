/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.*;

/**
 *
 * @author Jairo F
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpleadoBasico eb = new EmpleadoBasico(100, 5000);
        System.out.println(eb);
        
        EmpleadoComision ec = new EmpleadoComision(100, 5000, 7000);
        System.out.println(ec);
    }
    
}
