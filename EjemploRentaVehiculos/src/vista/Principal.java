/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.time.LocalDate;
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
        
        Vehiculo v = rentaVehiculo();
        devolucionVehiculo(v);
        
    }
    
    public static Vehiculo rentaVehiculo(){
        
        Vehiculo v;
        String placa=Entrada.leerString("Placa: ");
        char tipoVehiculo = Entrada.leerchar("Tipo vehiculo[A-> autobus , * -> tractor]: ");
        if(tipoVehiculo=='A' || tipoVehiculo=='a'){
            
            double precioKm= Entrada.leerDouble("PrecioKm: ");
            double kmRenta= Entrada.leerDouble("Km renta: ");
            double kmDev= Entrada.leerDouble("Km dev: ");
            v= new Autobus(precioKm, kmRenta, kmDev, placa, true);
            
        }
        else{
            
            double precioDia= Entrada.leerDouble("Precio dia ");
            LocalDate fechaRenta= LocalDate.parse(Entrada.leerString("Fehca renta(aaaa-mm-dd): "));
            LocalDate fechaDev= LocalDate.parse(Entrada.leerString("Fehca devolucion(aaaa-mm-dd): "));
            v = new Tractor(precioDia, fechaRenta, fechaDev, placa, true);
        
        }
        
        return v;
    }
    
    public static void devolucionVehiculo(Vehiculo v){
        
        v.setEstado(false);
        System.out.println("---------------------------------------------");
        System.out.println("Importe: " + v.calcularImporteRenta());
        System.out.println("--------------------------------------------");
        
    }
    
}
