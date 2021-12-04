/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import modelo.City;

/**
 *
 * @author denis
 */
public class CityDAO {
    ConexionBD conexion;
    
    public CityDAO(){
        conexion = new ConexionBD();
    }
    
    public boolean insertarCity(City c){
        boolean resultado = false;
        String sql = "INSERT INTO actor VALUES(" + c.getIdCity() + ", '" + c.getCity() + "', " + c.getIdCountry() +
                " , '" + c.getLastUpdate() + "');";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean eliminarCity(int idCity){
        boolean resultado = false;
        String sql = "DELETE FROM city WHERE city_id = \"" + idCity + "\"";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean modificarCity(City c){
        boolean resultado = false;
        
        String sql = "UPDATE city SET city = '" + c.getCity() + "', country_id = " + c.getIdCountry() + ", last_update = '" +
                "' WHERE city_id = " + c.getIdCity() + "";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
}
