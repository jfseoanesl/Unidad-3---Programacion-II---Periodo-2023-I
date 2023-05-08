/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Excepciones.MyExcepcion;

/**
 *
 * @author Jairo F
 */
public class Persistencia {
    
    
    public void ejecutarPersistencia(int dato) throws MyExcepcion{
    
        if(dato<0)
            throw new RuntimeException();
        
        if(dato==0)
            throw new MyExcepcion();
        
        System.out.println("Se persiste con " + dato);
        
    }
    
    
}
