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
}
