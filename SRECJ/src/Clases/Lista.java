/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author HOME
 */
public class Lista {

    private ArrayList<Usuario> usu;
    private ArrayList<Denuncia> den;

    public Lista() {
        usu = new ArrayList();
    }

   /* public void agregar(Usuario nuevo, String tipo) {
        if(tipo.equals("1. Comun"))
        usu.add(nuevo);
        else
            usu.add(nuevo);
    }*/
        public void agregarUsuario(Usuario nuevo){
        boolean bandera = false;
        for (Usuario usuario : usu) {
            if(usuario.getCedula().equals(nuevo.getCedula()) || usuario.getCorreo().equals(nuevo.getCorreo())){
                bandera = true;
                break;
            }
        }
        if(!bandera)
            usu.add(nuevo);
    }
    public boolean buscarCorreo(String correo){
        boolean validez=false;
        for (Usuario usuario : usu) {
            if(usuario.getCorreo().equals(correo)){
                validez = true;
                break;
            }else
                validez = false;
            
        }
        return validez;
    }
    public boolean buscarCedula(String cedula){
        boolean validez=false;
        for (Usuario usuario : usu) {
            if(usuario.getCedula().equals(cedula)){
                validez = true;
                break;
            }else
                validez = false;
            
        }
        return validez;
    }
    
    public boolean buscarClave(String clave){
        String claveBase;
        boolean validez=false;
        for (Usuario usuario : usu) {
            claveBase= usuario.getClave();
            if(claveBase.equals(clave)){
                validez = true;
                break;
            }else
                validez = false;
            
        }
        return validez;
    }
    public Usuario login(String correo, String clave ){
        Usuario aux = new Usuario();
        for (Usuario usuario : usu) {
            if(usuario.getCorreo().equals(correo) && usuario.getClave().equals(clave)){
                aux = usuario;
                break;
            }    
        }
        return aux;
    
    }
    
    public Usuario buscar (int indice) throws Exception{
        if(indice >= 0 && indice <= usu.size()){
            return usu.get(indice);
        } else {
            throw new Exception("Fuera de indice");
        }        
    }
    
    public int tamanio(){
        return usu.size();
    }
    
    public ArrayList<Usuario> getComponente(){
        return usu;
    }
    
   public String listarTerminos(){
       String resultado = "";
       
       for (Usuario componente : usu) {
            resultado += componente.toString();
       }
       return resultado;
   }
       public Lista listarTipo(String tipo) throws Exception{
        Lista aux = new Lista();
        for (Usuario usuarios : usu) {
            if(usuarios.getTipo().compareTo(tipo)!=0){
                aux.agregarUsuario(usuarios);
            }
        }
        return aux;
    }
    public ArrayList<Usuario> obtenerTodos(){
        return usu;
    }
   public boolean esVacia(){
       return usu.isEmpty();
   }
       public Usuario remove (int indice){
            return  usu.remove(indice);
            }
    /*public int buscarBinaria(int serial) {
        
        if (serial < comp.get(0).getSerial() || serial > comp.get(comp.size() - 1).getSerial()) {
            return -1;
        }
        int inf = 0;
        int sup = comp.size() - 1;
        int centro = 0;
        while (inf <= sup) {
            centro = (inf + sup) / 2;
            int serialAct = comp.get(centro).getSerial();
            if (serialAct == serial) {
                return centro;
            } else if (serial < serialAct) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }

        }
        return -1;
    }*/
}
