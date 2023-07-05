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
public class Abogado extends Usuario{
    
    private String credencial;
    private String codigoGerencia;
    private boolean disponibilidad;
    private int casosAsignados;
    private int casosCerrados;
    private float bono;
    
    public Abogado(String credencial, String codigoGerencia, boolean disponibilidad, int casosAsignados, int casosCerrados, float bono, String nombre, String apellido, String cedula, String clave, String telefono, String correo, String tipo, ColaConPrioridad cola) {
        super(nombre,apellido, cedula, clave, telefono, correo, tipo, cola);
        this.credencial = credencial;
        this.codigoGerencia = codigoGerencia;
        this.disponibilidad = disponibilidad;
        this.casosAsignados = casosAsignados;
        this.casosCerrados = casosCerrados;
        this.bono = bono;
    }
    

    public Abogado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCasosAsignados() {
        return casosAsignados;
    }

    public void setCasosAsignados(int casosAsignados) {
        this.casosAsignados = casosAsignados;
    }

    public int getCasosCerrados() {
        return casosCerrados;
    }

    public void setCasosCerrados(int casosCerrados) {
        this.casosCerrados = casosCerrados;
    }

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }
    
    public void obtenerCaso(String cedula){
        
    }
    
    public boolean cambiarDisponibilidad(){
      return true;
      
    }
    public boolean cerrarCaso(){
        return true;
    }
    
    public float bonoObtenido(){
        return 0 ;
    }
}
