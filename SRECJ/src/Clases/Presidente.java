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
public class Presidente extends Usuario{
    private String pin;
    private String credenciales;

  
    

    public Presidente(String pin, String credenciales, String nombre,String apellido, String cedula, String contraseña, String telefono, String correo, String tipo, ColaConPrioridad cola) {
        super(nombre,apellido, cedula, contraseña, telefono, correo, tipo, cola);
        this.pin = pin;
        this.credenciales = credenciales;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
    
    public void agregarAbogado(){
        
        
    }
    public void eliminarAbogado(){
        
    }
    
    
}
