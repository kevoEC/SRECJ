/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author RYZEN 5
 */
public class Comun extends Usuario{
    Denuncia aux ;
    public Comun(String nombre, String apellido,String cedula, String contraseña, String telefono, String correo, String tipo, ColaConPrioridad cola) {
        super(nombre,apellido, cedula, contraseña, telefono, correo, tipo, cola);
    }

    
    
    public Denuncia ingresarDenuncia (){
        
        return aux;
    }
    public boolean revisarEstadoCaso(){
        return true;
    }
    
    public boolean agendarCitaPresidencia(){
        return true;
    }
    public void eliminarDenuncia(){
        
    }
}
