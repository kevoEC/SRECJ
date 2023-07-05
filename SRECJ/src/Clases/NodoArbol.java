/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PauloGuerraT
 */
public class NodoArbol {
    private Denuncia dato;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(Denuncia dato, NodoArbol izquierdo, NodoArbol derecho) {
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public Denuncia getDato() {
        return dato;
    }

    public void setDato(Denuncia dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }

    public String mostrar(){
        return ""+dato+"\n";
    }
    
    
}
