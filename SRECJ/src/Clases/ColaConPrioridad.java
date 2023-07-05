/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


/**
 *
 * @author rosco
 */
public class ColaConPrioridad {
    
    private ArrayList<Denuncia> cola;
    
    public ColaConPrioridad(){
        cola = new ArrayList<Denuncia>();
    }
    public boolean esVacia(){
        return cola.isEmpty();
    }
    
    public void encolar(Denuncia dato){
        cola.add(dato);
    }
    public Denuncia remove (int indice){
            return  cola.remove(indice);
            }
        
    
    public Denuncia frente(){
        return cola.get(0);
    }
    public Denuncia asignarAbogado(int indice, String Cedula){    
        return cola.get(indice);
    }
    
    public Denuncia obtenerConIndice(int indice){    
    return cola.get(indice);
    }
    public int Size(){    
    return cola.size();
    }
    public void actualizar (String codigo, Denuncia nuevo){
        for (int i = 0; i < cola.size(); i++) {
            if(cola.get(i).getCodigo().equals(codigo)){
                cola.set(i, nuevo);
                break;
            }
        }
    }
     public boolean actualizarBool (String codigo, Denuncia nuevo){

        boolean bandera =false;
        for (int i = 0; i < cola.size(); i++) {
            if(cola.get(i).getCodigo().equals(codigo)){
                bandera = true;
                break;
            }
            else{
                bandera = false;
            }
        }
        return bandera;
    }
    /**
     *
     * @return
     */
    public ArrayList<Denuncia> obtenerTodos(){
        return cola;
    }
}
