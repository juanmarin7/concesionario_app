/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario_app;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author SSSA
 */
import javax.swing.JOptionPane;
public class Concesionario_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreAG;
        //Mensajes emergentes para solicitar info del vehiculo
        Vehiculo vehiculo = new VehiculoDeportivo(
                           
                            nombreAG = JOptionPane.showInputDialog("Nombre del Carro"),
                            JOptionPane.showInputDialog("Marca"),
                            JOptionPane.showInputDialog("Modelo"),
                            JOptionPane.showInputDialog("Caja"),
                            JOptionPane.showInputDialog("Color"),
                            JOptionPane.showInputDialog("Precio"),
                            JOptionPane.showInputDialog("Kilometraje"),
                            JOptionPane.showInputDialog("Stock"),
                            JOptionPane.showInputDialog("BodyKit")
                );
        Vehiculo vehiculo1 = new VehiculoDeportivo("Hachi-Roku", "Toyota", "1986", "Automatica", "Blanco", "800.000.000", "200.000", "No", "RocketBunny");
        
        //insert into testa.carros (nombre,marca,modelo,caja,color,precio.kmtraje,stock) values (?, ?, ?, ?, ?, ?, ?, ?, ?);
        
        System.out.println(vehiculo.Mostradatos());
        System.out.println(vehiculo1.Mostradatos());
        //System.out.println(HondaTypeR.Mostradatos());
        
        
    }
    
}
