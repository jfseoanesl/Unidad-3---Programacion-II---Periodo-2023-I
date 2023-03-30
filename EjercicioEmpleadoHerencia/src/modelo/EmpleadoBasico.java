/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo F
 */
public class EmpleadoBasico {
    
    private int horasTrabajadasMes;
    private double valorHora;

    public EmpleadoBasico() {
    }

    public EmpleadoBasico(int horasTrabajadasMes, double valorHora) {
        this.horasTrabajadasMes = horasTrabajadasMes;
        this.valorHora = valorHora;
    }

    /**
     * @return the horasTrabajadasMes
     */
    public int getHorasTrabajadasMes() {
        return horasTrabajadasMes;
    }

    /**
     * @param horasTrabajadasMes the horasTrabajadasMes to set
     */
    public void setHorasTrabajadasMes(int horasTrabajadasMes) {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoBasico{" + "horasTrabajadasMes=" + horasTrabajadasMes + 
                ", valorHora=" + valorHora +
                ", sueldoMes: " +calcularSueldo()+ '}';
    }
    
    public double calcularSueldo(){
        
        return this.horasTrabajadasMes * this.valorHora;
    }
    
}
