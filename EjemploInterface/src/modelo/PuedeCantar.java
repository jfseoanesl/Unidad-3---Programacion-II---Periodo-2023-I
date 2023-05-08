/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo F
 */
public interface PuedeCantar {
    
    String CANTO_PERSONA = "DO RE MI FA SO LA SI...";
    String CANTO_PAJARO = "FIU FIU FIU...";
    String CANTO_GALLO = "COCOROCOOO...COCOROCOO...";
    
    public abstract String cantar();
    
    
}
