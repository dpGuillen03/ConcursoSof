/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursosof;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import concursosof.*;

/**
 *
 * @author DiegoP
 */
public class Pregunta {
    
    private String pregunta;
    private List<Respuestas> respuestas;

    public Pregunta(String pregunta, List<Respuestas> respuestas) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }

    public Pregunta() {
    }
    
    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<>();
    }
    
    public  void BorrarList(){
        this.respuestas.clear();
    }
    
    private static final String indicador = "abcd";
    
    public boolean respuestaCorrecta(char respuesta) {
        int indice = indicador.indexOf(respuesta);
            if (indice == -1) {
                return false;
            }
            return this.respuestas.get(indice).isTov();
    }
    
    
    
    public  boolean preguntar(int numero, String jugadorP, int puntos) {
       System.out.println("Pregunta: " + this.pregunta);
       int indice = 0;
           for (Respuestas r : this.respuestas) {
               System.out.printf("%c) %s\n", indicador.charAt(indice), r.getRespuesta());
               indice++;
            }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita la Letra de tu respuesta: ");
        System.out.println("Si te quieres retirar Digita la letra 's' ");
        char respuesta = sc.nextLine().charAt(0);
        
        if(respuesta == 's'){
            //Agg Funcion q envie los datos al archivo txt
            Historial guardar = new Historial();
            guardar.AgregarHistorial(jugadorP, puntos);
            Jugada jugada = new Jugada();
        
        jugada.inicio();
            
        }
        return this.respuestaCorrecta(respuesta);
    }
    
}
