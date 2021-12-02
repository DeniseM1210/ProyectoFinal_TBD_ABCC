/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denis
 */
public class ConexionBD {
    private Connection conexion;
    private Statement stn;
    private ResultSet rs;

    public ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String URL = "jdbc:mysql://localhost:3306/sakila";
            
            conexion = DriverManager.getConnection(URL, "denise", "hanji");
            
            System.out.println("Conexión Establecida");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de DRIVER");
        } catch (SQLException ex) {
            System.out.println("Error de conexión a MySQL o de la BD");
        }
    }
    
    public void cerrarConexionBD(){
        try {
            stn.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión");
            ex.printStackTrace();
        }
    }
    
    public boolean ejecutarInstruccion(String sql){
        try {
            stn = conexion.createStatement();
            int resultado = stn.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("No se pudo ejecutar la instrucción");
            ex.printStackTrace();
            return false;
        }
        return false;
    }
    
    public ResultSet ejecutarConsulta(String sql){
        try {
            stn = conexion.createStatement();
            rs = stn.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("No se pudo ejecutar la instrucción");
            ex.printStackTrace();
        }
        return rs;
    }
}
