/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.*;
import Servicios.*;

/**
 *
 * @author estudiante
 */
public class Servicios {
    
    String nombre;
    
    public void Alquilar(Alquiler alquiler){
        try{
            UsuarioServicios us = new UsuarioServicios();
            us.guardar(Conexion.obtener(), alquiler.getUsuario());
        } catch(Exception e){}
    }  
}
