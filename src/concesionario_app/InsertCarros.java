/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario_app;

import conexion.conectar;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author SSSA
 */
public class InsertCarros {
    private final String SQL_INSERT ="insert into testa.carros (nombre,marca,modelo,caja,color,precio.kmtraje,stock) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private PreparedStatement PrivSt;
    private final conectar conec;
    
    public InsertCarros(){
        PrivSt = null;
        conec = new conectar();
    }
    public int insertDatos(String nombre,String marca,String modelo,String caja,String color,String precio,String kmtraje,String stock){
        try {
            PrivSt = conec.getConnection().prepareStatement(SQL_INSERT);
            PrivSt.setString(1, nombre);
             PrivSt.setString(2, marca);
              PrivSt.setString(3, modelo);
                PrivSt.setString(4, caja);
                  PrivSt.setString(5, color);
                    PrivSt.setString(6, precio);
                      PrivSt.setString(7, kmtraje);
                        PrivSt.setString(8, stock );
                        int res = PrivSt.executeUpdate();
                        
                        if(res > 0){
                            JOptionPane.showMessageDialog(null, "Registro exitoso");
                        }
                  
        } catch (SQLException | HeadlessException e) {
            System.err.println("Error al guardar los datos en la BD"+ e.getMessage());
        }finally{
            PrivSt =null;
            conec.cerrar();
        }
        return 0;
    }
}
