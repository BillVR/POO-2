/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.sql.*;
import Modelo.*;

/**
 *
 * @author estudiante
 */
public class UsuarioServicios {
    
    public void guardar(Connection conexion, Usuario usuario) throws SQLException{
        try {
            
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO usuario (id, identificacion, nombre, edad)" + "VALUES(?, ?, ?, ?)");
            consulta.setInt(1, usuario.getNum_id());
            consulta.setInt(2, usuario.getIdentificacion());
            consulta.setString(3, usuario.getNombre());
            consulta.setInt(4, usuario.getEdad());
            consulta.executeUpdate();
            
        } catch (SQLException ex){
            throw new SQLException(ex);   
        }
    }   
}
