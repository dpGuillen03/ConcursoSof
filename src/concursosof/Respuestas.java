/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursosof;

/**
 *
 * @author DiegoP
 */

public class Respuestas {

   
    private String respuesta;
    private boolean tov;

    public Respuestas(String respuesta, boolean tov) {
        this.respuesta = respuesta;
        this.tov = tov;
    }

    public Respuestas() {
    }
    

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isTov() {
        return tov;
    }

    public void setTov(boolean tov) {
        this.tov = tov;
    }
    
    
    
    
}
