/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexionBD.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 *
 * @author denis
 */
public class UsuarioDAO {
    ConexionBD conexion;
    public String filtro;
    
    public UsuarioDAO(){
        conexion = new ConexionBD();
    }
    
    public Usuario buscar(String filtro){
        Usuario u = new Usuario();
        String sql = "SELECT * FROM usuarios WHERE usuario = '" + filtro + "';";
        
        ResultSet rs = conexion.ejecutarConsulta(sql);
        try {
            u.setUsuario(rs.getString(1));
            u.setPassword(rs.getString(2));
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return u;
    }
}
