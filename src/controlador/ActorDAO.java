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
    
    
}
