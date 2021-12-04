/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import modelo.Actor;

/**
 *
 * @author denis
 */
public class ActorDAO {
    ConexionBD conexion;

    public ActorDAO() {
        conexion = new ConexionBD();
    }
    
    public boolean insertarActor(Actor a){
        boolean resultado = false;
        String sql = "INSERT INTO actor VALUES(" + a.getIdActor() + ", '" + a.getFirstName()+ "' , '"
                + a.getLastName() + "' , '" + a.getLastUpdate() + "');";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean eliminarActor(int idActor){
        boolean resultado = false;
        String sql = "DELETE FROM actor WHERE actor_id = \"" + idActor + "\"";
        resultado = conexion.ejecutarInstruccion(sql);
        return resultado;
    }
    
    public boolean modificarActor(Actor a){
        boolean resultado = false;
        
        String sql = "UPDATE actor SET first_name = '" + a.getFirstName() + "', last_name = '" + a.getLastName() +
                "', last_update = '" + a.getLastUpdate() + "' WHERE actor_id = " + a.getIdActor() + "";
        resultado = conexion.ejecutarInstruccion(sql);
        
        return resultado;
    }
}
