/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Excepciones.MyExcepcion;
import persistencia.Persistencia;

/**
 *
 * @author Jairo F
 */
public class Modelo {
    private Persistencia persistencia;

    public Modelo() {
        this.persistencia = new Persistencia();
    }
    
    
    public void ejecutarModelo (int dato) throws MyExcepcion{
    
            this.persistencia.ejecutarPersistencia(dato);
    }
    
}
