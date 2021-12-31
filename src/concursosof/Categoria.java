/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursosof;


import java.util.ArrayList;


/**
 *
 * @author DiegoP
 */
public class Categoria {
    
   
     
   
    private ArrayList<Pregunta> preguntas;

    public Categoria() {
        this.preguntas = new ArrayList<>();
    }

    public void addPregunta(Pregunta preg) {
        this.preguntas.add(preg);
    }
    
  
   
   

    public void preguntar( int seccion, String jugadorP, int points) {   
        int numero = (int)(Math.random()*this.preguntas.size());
            Pregunta p = this.preguntas.get(numero);
                boolean resultado = p.preguntar(numero,jugadorP,points);
        
                if(resultado){
                    
                   if(seccion == 1){
                    Jugada j = new Jugada();
                   // Pregunta r = new Pregunta();
                    //this.preguntas.clear();
                   // r.BorrarList();
                   // j.acumular(100);
                  // ConexionBD con = new ConexionBD();
                 // con.insertar(jugadorP, points);
                    j.JugarNivel2(jugadorP,points + 100 );
                    
                    
                   }
                   if(seccion == 2){
                    Jugada j = new Jugada();
                   // Pregunta r = new Pregunta();
                    //this.preguntas.clear();
                   // r.BorrarList();
                   // j.acumular(100);
                    j.JugarNivel3(jugadorP,points + 200);
                    
                   }
                    
                   if(seccion == 3){
                    Jugada j = new Jugada();
                   // Pregunta r = new Pregunta();
                    //this.preguntas.clear();
                    // r.BorrarList();
                    // j.acumular(100);
                    j.JugarNivel4(jugadorP,points + 300);
                    
                   }
                   
                   if(seccion == 4){
                    Jugada j = new Jugada();
                   // Pregunta r = new Pregunta();
                    //this.preguntas.clear();
                    // r.BorrarList();
                    // j.acumular(100);
                    j.JugarNivel5(jugadorP,points + 400);
                    
                   }
                   if(seccion == 5){
                    Jugada j = new Jugada();
                    Historial h = new Historial();
                    // Pregunta r = new Pregunta();
                    //this.preguntas.clear();
                    // r.BorrarList();
                    // j.acumular(100);
                    h.AgregarHistorial(jugadorP, points + 1000);
                    System.out.print("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
                    System.out.print("Felicitaciones Terminaste el Juego, Completaste todas las Rondas.\n");
                    System.out.print("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
                    j.inicio();
                    
                   }
                   
                } else {
                    System.out.println("RESPUESTA INCORRECTA\n");
                    Historial h = new Historial();
                    h.AgregarHistorial(jugadorP, 0);
                    
               
                }
            
    }

   
    
   
    
}
