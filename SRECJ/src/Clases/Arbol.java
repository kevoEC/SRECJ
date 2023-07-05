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
public class Arbol {
    private NodoArbol raiz;
    
    public Arbol(){
      raiz=null;
      
    }
    
    public Arbol(Denuncia nuevo){
      raiz=new NodoArbol(nuevo, null, null);
    }
    
    public void insertar(NodoArbol nuevo, NodoArbol actual){
         if(nuevo.getDato().getGravedad()<actual.getDato().getGravedad()){
             if(actual.getIzquierdo()==null){
                actual.setIzquierdo(nuevo);
             }else{
                 insertar(nuevo, actual.getIzquierdo());
             }
         }else{
             if(actual.getDerecho()==null){
                actual.setDerecho(nuevo);
             }else{
                 insertar(nuevo, actual.getDerecho());
             }
         
         }
    
    }
    
    public void insertar(Denuncia nuevo){
       if(raiz==null)
           raiz=new NodoArbol(nuevo, null, null);
       else
         insertar(new NodoArbol(nuevo, null, null),raiz);
    }
    
    public String preOrden(NodoArbol actual){
       if(actual!=null){
           return actual.getDato().toString()+"\n"+
           preOrden(actual.getIzquierdo())+
           preOrden(actual.getDerecho());
       }else{
          return "";
       }
    }
    
    public String preOrden(){
      if(raiz!=null){
         return preOrden(raiz);
      }else{
          return "No se han registrado denuncias";
      }
    }

    public void mostrarPreOrden(){
        mostrarPreOrden(raiz);
    }
    public void mostrarPreOrden(NodoArbol tmp) {
        tmp.mostrar();
        if(tmp.getIzquierdo()!=null)
            mostrarPreOrden(tmp.getIzquierdo());
        if(tmp.getDerecho()!=null)
            mostrarPreOrden(tmp.getDerecho());
    }
    
    
    
}
