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
public class Denuncia implements Comparable<Denuncia> {
    private String caracterDenuncia;
    private String instanciaDenuncia;
    private String asistenciaPersonal;
    private String responsables;
    private String cartaDenuncia;
    private String cedulaUsuario;
    private int gravedad;
    private String estado;
    private String codigo;
    //private File subirArchivo;

    public Denuncia() {
    }
    
    
    public Denuncia(String caracterDenuncia, String instanciaDenuncia, String asistenciaPersonal,String responsables, String cartaDenuncia, String cedulaUsuario, int gravedad, String estado, String codigo) {
        this.caracterDenuncia = caracterDenuncia;
        this.instanciaDenuncia = instanciaDenuncia;
        this.asistenciaPersonal = asistenciaPersonal;
        this.responsables=responsables;
        this.cartaDenuncia = cartaDenuncia;
        this.cedulaUsuario = cedulaUsuario;
        this.gravedad= gravedad;
        this.estado = estado;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
    
    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getResponsables() {
        return responsables;
    }

    public void setResponsables(String responsables) {
        this.responsables = responsables;
    }

    public String getCaracterDenuncia() {
        return caracterDenuncia;
    }

    public void setCaracterDenuncia(String caracterDenuncia) {
        this.caracterDenuncia = caracterDenuncia;
    }

    public String getInstanciaDenuncia() {
        return instanciaDenuncia;
    }

    public void setInstanciaDenuncia(String instanciaDenuncia) {
        this.instanciaDenuncia = instanciaDenuncia;
    }

    public String isAsistenciaPersonal() {
        return asistenciaPersonal;
    }

    public void setAsistenciaPersonal(String asistenciaPersonal) {
        this.asistenciaPersonal = asistenciaPersonal;
    }

    public String getCartaDenuncia() {
        return cartaDenuncia;
    }

    public void setCartaDenuncia(String cartaDenuncia) {
        this.cartaDenuncia = cartaDenuncia;
    }
    
    public String generarCodigoAsignacion(){
        return "";
    }
    
    public int algoritmoAnaliticoBusquedaPalabrasClave(String Carta){
        int gravedad=0;
        char [] ch = Carta.toCharArray();
        StringBuilder strbuild = new StringBuilder();
        for(char c : ch){
            if(Character.isDigit(c)){
                strbuild.append(c);
            }
        }
        //int valoresCarta = Integer.parseInt(strbuild.toString());
        /*if(valoresCarta!=null){}else{
        }*/
        
        
        if(Carta.contains("robo sin arma") || Carta.contains("juicio de Alimentos") || Carta.contains("exceso de velocidad") || Carta.contains("multa Pequeña")||
              Carta.contains("acusacion estafa") ||Carta.contains("robo menor") || Carta.contains("acusacion Robo menor") || Carta.contains("robo de una casa")
                || Carta.contains("Robo a mano armada")|| Carta.contains("estafa pequeña") || Carta.contains("estafa de una cantidad monetaria pequeña") ||
                Carta.contains("trafico menor de drogas") || Carta.contains("robo de menos de 1000 dolares") /*|| valoresCarta<1000*/  ){
            
                gravedad = 1;
                
        }else if(Carta.contains("robo a mano armada") || Carta.contains("detencion ilegal") || Carta.contains("Exceso de velocidad") || Carta.contains("Multa mediana")||
              Carta.contains("acusacion estafa") ||Carta.contains("robo grande") || Carta.contains("Acusacion Robo menor") || Carta.contains("Robo de una casa")
                ||Carta.contains("trafico intermedio de drogas") || Carta.contains("robo de mas de 1000 dolares")
                || Carta.contains("Robo a mano armada")|| Carta.contains("Estafa multipiramidal") || Carta.contains("Estafa de una cantidad monetaria intermedia") /*|| valoresCarta<1000*/ ){
                gravedad = 2;
        
        }else if(Carta.contains("asesinato") || Carta.contains("corte Internacional")|| Carta.contains("muerte") || Carta.contains("violacion") ||Carta.contains("trafico masivo de drogas") ||
                Carta.contains("asesinato sin intencion") || Carta.contains("robo de mas de 10000 dolares")){
                gravedad = 3;
        }else{
                gravedad = 0;
        }
        
        return gravedad;
    }
        

    @Override
    public String toString() {
        return estado+"              "+codigo+"                   "+gravedad+"                       "+caracterDenuncia +"          "+ instanciaDenuncia +"                       "+asistenciaPersonal +"                            "+ responsables +"// " +cartaDenuncia;
    }
    
    @Override
    public int compareTo(Denuncia den) {
       if(this.gravedad>den.getGravedad()){
           return 1;
       }
       else{
           return -1;
       }
    }
    
}
