/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author SSSA
 */
public class conectar {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD ="3lp3p3";
    private static final String URL = "jdbc:mysql:localhost:3306/concesionario?autoReconnect=true&useSSL=false";
    private Connection conec;
    
    public conectar(){
        conec = null;
    }
    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            conec = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error al conectar con la base de datos",JOptionPane.ERROR);
            System.exit(0);
            
    }
        return conec;
}
    
public void cerrar(){
    try {
        conec.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage(),"Error al cerrar la conexion de la BD",JOptionPane.ERROR);
    }
    }
}
