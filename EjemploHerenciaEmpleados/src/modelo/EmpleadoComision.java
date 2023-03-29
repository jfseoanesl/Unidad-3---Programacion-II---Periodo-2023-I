/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo F
 */
public class EmpleadoComision extends EmpleadoBasico{
    
    private double valorComision;
    public EmpleadoComision() {
        
    }

    public EmpleadoComision(int horasTrabajadasMes, double valorHora, double valorComision) {
        super(horasTrabajadasMes, valorHora);
        this.valorComision = valorComision;
    }

    /**
     * @return the valorComision
     */
    public double getValorComision() {
        return valorComision;
    }

    /**
     * @param valorComision the valorComision to set
     */
    public void setValorComision(double valorComision) {
        this.valorComision = valorComision;
    }

    @Override
    public String toString() {
        return "EmpleadoComision{"+ super.toString() + ", valorComision=" + valorComision + '}';
    }
    
    @Override
    public double calcularSueldo(){
        
        return super.calcularSueldo() + this.valorComision;
    }
    
}
