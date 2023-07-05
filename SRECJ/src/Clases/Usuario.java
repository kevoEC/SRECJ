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
public class Usuario {

    private String nombre;
    private String apellido;
    private String cedula;
    private String clave;
    private String telefono;
    private String correo;
    private String tipo;
    private String credencial;
    private String codigoGerencia;
    private String pin;
    private String disponibilidad;
    private ColaConPrioridad coladen;

    public Usuario() {

        this.cedula="";
        this.apellido="";
        this.nombre="";
        this.clave="";
        this.telefono="";
        this.correo="";
    }

    public Usuario(String nombre, String apellido,String cedula, String contraseña, String telefono, String correo, String tipo, ColaConPrioridad coladen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.clave = contraseña;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo=tipo;
        this.coladen = coladen;
    }

    public Usuario(String nombre, String apellido, String cedula, String contraseña, String telefono, String correo, String tipo , String credencial, String codigoGerencia, String disponibilidad, ColaConPrioridad coladen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.clave = contraseña;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo=tipo;
        this.credencial = credencial;
        this.codigoGerencia = codigoGerencia;
        this.disponibilidad = disponibilidad;
        this.coladen=coladen;
    }
    /*public Usuario(String nombre, String apellido, String cedula, String contraseña, String telefono, String correo, String tipo , String credencial, String codigoGerencia, String disponibilidad, String pin){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.clave = contraseña;
        this.telefono = telefono;
        this.correo = correo;
        this.tipo=tipo;
        this.credencial = credencial;
        this.codigoGerencia = codigoGerencia;
        this.disponibilidad = disponibilidad;
        this.pin = pin;
    }*/

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ColaConPrioridad getColaden() {
        return coladen;
    }

    public void setColaden(ColaConPrioridad coladen) {
        this.coladen = coladen;
    }
    
    public Usuario(String nombre, String contraseña, String correo,String cedula, ColaConPrioridad colatotal,String tipo){
        this.nombre = nombre;
        this.clave = contraseña;
        this.correo = correo;
        this.cedula=cedula;
        this.coladen = colatotal;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getClave() {
        return clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getCodigoGerencia() {
        return codigoGerencia;
    }

    public void setCodigoGerencia(String codigoGerencia) {
        this.codigoGerencia = codigoGerencia;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + ", apellido:" + apellido + ", cedula: " + cedula + ", clave:" + clave + ", telefono:" + telefono + ", correo: " + correo + ", tipo: " + tipo + ", credencial: " + credencial + ", codigoGerencia: " + codigoGerencia + '}';
    }
    
    public String toStringAbg(){
        return disponibilidad+"                                        "+nombre+"/"+apellido+"                                "+ correo+"           "+"                        0        ";
    }

    
    
    
}
