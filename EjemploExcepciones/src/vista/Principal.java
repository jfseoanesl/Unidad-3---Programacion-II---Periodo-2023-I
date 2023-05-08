/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import Excepciones.MyExcepcion;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.Modelo;

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

        Scanner entrada = new Scanner(System.in);
        Modelo modelo = new Modelo();
        System.out.println("Registre un valor: ");
        
        try {
            int dato = entrada.nextInt();
            modelo.ejecutarModelo(dato);
        } catch (MyExcepcion me) {
            me.printStackTrace();
            System.out.println(me);
        }
        catch(InputMismatchException ime){
            System.out.println("Se requiere un valor entero");
        }

    }

}
