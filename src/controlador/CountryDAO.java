/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import modelo.Country;

/**
 *
 * @author denis
 */
public class CountryDAO {
    ConexionBD conexion;
    
    public CountryDAO(){
        conexion = new ConexionBD();
    }
    
    public boolean insertarCountry(Country c){
        boolean resultado = false;
        String sql = "INSERT INTO country VALUES(" + c.getIdCountry() + ", '" + c.getCountry() + "', '" +
                c.getLastUpdate() + "');";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean eliminarCountry(int idCountry){
        boolean resultado = false;
        String sql = "DELETE FROM country WHERE country_id = \"" + idCountry + "\"";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean modificarCountry(Country c){
        boolean resultado = false;
        
        String sql = "UPDATE country SET country = '" + c.getCountry() + "', last_update = '" + c.getLastUpdate() + "' WHERE country_id = " +
                c.getIdCountry() + "";
        resultado = conexion.ejecutarInstruccion(sql);
        
        return resultado;
    }
}
