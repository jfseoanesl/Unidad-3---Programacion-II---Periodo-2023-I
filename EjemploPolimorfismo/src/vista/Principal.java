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
    
    public static void devolucionVehiculo(Vehiculo v){
        
         v.setEstado(false);
         // imprimir los datos del vehiculo segun su tipo
         // Autobus: 
         // precio renta, km rnta, km dev
         
         // tractor:
         // precio dia, fecha renta, fecha devol
         System.out.println("\n---------------------------------");
         System.out.println("Importe de renta: " + v.calcularImporteRenta());
         System.out.println("---------------------------------");
    
    }
    
    public static Vehiculo rentaVehiculo(){
     
        Vehiculo v;
        String placa = Entrada.leerString("Placa:");
        char tipoVehiculo= Entrada.leerChar("Tipo [A->autobus, * ->tractor]: ");
        if(tipoVehiculo=='A' || tipoVehiculo=='a'){
            double precioKm=Entrada.leerDouble("Precio Km: ");
            double kmRenta=Entrada.leerDouble("Km renta: ");
            double kmDev=Entrada.leerDouble("Km devolucion: ");
            v = new Autobus(precioKm, kmDev, kmDev, placa, true);
        }
        else{
            
            double precioDia = Entrada.leerDouble("Precio dia: ");
            LocalDate fechaRenta = LocalDate.parse(Entrada.leerString("Fecha renta(aaaa-mm-dd):  " ));
            LocalDate fechaDevolucion = LocalDate.parse(Entrada.leerString("Fecha devolucion(aaaa-mm-dd): " ));
            v = new Tractor(precioDia, fechaDevolucion, fechaRenta, placa, true);
        }
        
        return v;
    
    }
    
}
