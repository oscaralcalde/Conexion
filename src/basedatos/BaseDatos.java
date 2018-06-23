/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;
import java.sql.*;
import javax.swing.JOptionPane;
//Para el sql server
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author oscar
 */
public class BaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexion = null;
        try{
        
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
         String Url = "jdbc:sqlserver://0001C\\SQLEXPRESS:1433;databaseName=persona;user=testjava;password=testjava;";
         
         conexion = DriverManager.getConnection(Url);
         
         JOptionPane.showMessageDialog(null,"conectado");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex,"Error al Conectar"+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
