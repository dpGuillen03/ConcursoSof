/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursosof;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author DiegoP
 */
public class Jugada {
    
     String jugador = "";
     int puntos = 0;

    public Jugada() {
        
    }
 
    public void acumular(int premio){
        
        this.puntos += premio;
    }
    
    public void perdio(){
        
        this.puntos = 0;
    }
    
    public void inicio(){
        
        Scanner sc = new Scanner(System.in);
      
       
        byte opcion;
        
        do{
            
           // Categoria con = new Categoria();
            
           // con.conexion();
                    
            
            System.out.print("MENU\n "+"1. INICIAR JUEGO\n "+"2. HISTORIAL GANADORES\n "+"3. SALIR\n");
            System.out.print("      \n");
            System.out.print("Digita el numero con tu seleccion:");
            opcion = Byte.parseByte(sc.nextLine());
            System.out.print("      \n");
            
            
            switch(opcion){
                case 1:
                    
                    Jugada j = new Jugada();
                    
                    j.JugarNivel1();
                    
                    break;
                    
                case 2:
                    Historial listado = new Historial();
                    listado.listHistorial();
                    break;
                    
                case 3:
                    
                    break;
                    
                default:
                    System.out.print("No seleccionaste una Opcion correcta :(");
                    break;
                    
            }
            
        }while(opcion != 3);
    }
    
    
   
    public void JugarNivel1(){
  
      //AGREGAMOS LAS PREGUNTAS CON LAS RESPUESTAS DE LA CATEGORIA 1
       Categoria categoria = new Categoria();
       categoria.addPregunta(new Pregunta("1 + 1 = ?", List.of(
       new Respuestas("3", false),
       new Respuestas("4", false),
       new Respuestas("1", false),
       new Respuestas("2", true)
       )));
       categoria.addPregunta(new Pregunta("10 - 4 = ?", List.of(
       new Respuestas("4", false),
       new Respuestas("6", true),
       new Respuestas("3", false),
       new Respuestas("5", false)
       )));
       categoria.addPregunta(new Pregunta("3 x 5", List.of(
       new Respuestas("15", true),
       new Respuestas("10", false),
       new Respuestas("16", false),
       new Respuestas("12", false)
       )));
       categoria.addPregunta(new Pregunta("20 / 2", List.of(
       new Respuestas("11", false),
       new Respuestas("8", false),
       new Respuestas("40", false),
       new Respuestas("10", true)
       )));
       categoria.addPregunta(new Pregunta("5 + 35", List.of(
       new Respuestas("41", false),
       new Respuestas("40", true),
       new Respuestas("39", false),
       new Respuestas("42", false)
       )));
       //-------------------------------------
        Scanner sc = new Scanner(System.in);
       
        
        System.out.print("Digita Tu Nombre o Alias: ");
        
        
       this.jugador = sc.nextLine();
        
        System.out.print("------------------------\n");
        
       
        System.out.print(
                    "Ronda #1 -- Gana y llevate 100 puntos\n"
                    +"Jugador: "+ this.jugador+"\n"
                    +"Acumulado: "+ this.puntos +" \n"          
                    +"                                  \n"
            );
        
        int seccion = 1;
        categoria.preguntar(seccion, this.jugador, this.puntos);
        
    
    }
    
     public void JugarNivel2(String jugs , int points ){
  
     
       
      //AGREGAMOS LAS PREGUNTAS CON LAS RESPUESTAS DE LA CATEGORIA 2
       Categoria categoria = new Categoria();
       categoria.addPregunta(new Pregunta("Rojo en Ingles", List.of(
       new Respuestas("Greem", false),
       new Respuestas("Blue", false),
       new Respuestas("Yellow", false),
       new Respuestas("Red", true)
       )));
       categoria.addPregunta(new Pregunta("Amarillo en Ingles", List.of(
       new Respuestas("Red", false),
       new Respuestas("Orange", false),
       new Respuestas("Yellow", true),
       new Respuestas("White", false)
       )));
       categoria.addPregunta(new Pregunta("Rosado en Ingles", List.of(
       new Respuestas("Greem", false),
       new Respuestas("Blue", false),
       new Respuestas("Purple", false),
       new Respuestas("Pink", true)
       )));
       categoria.addPregunta(new Pregunta("Verde en Ingles", List.of(
       new Respuestas("Brown", false),
       new Respuestas("Blue", false),
       new Respuestas("Gray", false),
       new Respuestas("Greem", true)
       )));
       categoria.addPregunta(new Pregunta("Azul en Ingles", List.of(
       new Respuestas("Blue", true),
       new Respuestas("Crimson", false),
       new Respuestas("Black", false),
       new Respuestas("Silver", false)
       )));
       //-------------------------------------
       
        
        
        System.out.print("------------------------\n");
        
        
        System.out.print(
                    "Ronda #2 -- Gana y llevate 200 puntos\n"
                    +"Jugador: "+ jugs +"\n"
                    +"Acumulado: "+ points +" \n"
                    +"                                  \n"          
                  
            );
        
        int seccion = 2;
        categoria.preguntar(seccion,jugs,points);
        
    
    }
     
    public void JugarNivel3(String jugs , int points){
  
        
       
       
      //AGREGAMOS LAS PREGUNTAS CON LAS RESPUESTAS DE LA CATEGORIA 3
       Categoria categoria = new Categoria();
       categoria.addPregunta(new Pregunta("Simbolo del Oxigeno", List.of(
       new Respuestas("K", false),
       new Respuestas("Fe", false),
       new Respuestas("O", true),
       new Respuestas("He", false)
       )));
       categoria.addPregunta(new Pregunta("Simbolo del Carbono", List.of(
       new Respuestas("C", true),
       new Respuestas("O", false),
       new Respuestas("Au", false),
       new Respuestas("H", false)
       )));
       categoria.addPregunta(new Pregunta("Simbolo del Hidrogeno", List.of(
       new Respuestas("He", false),
       new Respuestas("Na", false),
       new Respuestas("N", false),
       new Respuestas("H", true)
       )));
       categoria.addPregunta(new Pregunta("Simbolo del Sodio", List.of(
       new Respuestas("Fe", false),
       new Respuestas("Na", true),
       new Respuestas("So", false),
       new Respuestas("D", false)
       )));
       categoria.addPregunta(new Pregunta("Simbolo del Litio", List.of(
       new Respuestas("M", true),
       new Respuestas("Li", true),
       new Respuestas("G", false),
       new Respuestas("L", false)
       )));
       //-------------------------------------
       
        
        
        System.out.print("------------------------\n");
        
        
        System.out.print(
                    "Ronda #3 -- Gana y llevate 300 puntos\n"
                    +"Jugador: "+ jugs +"\n"
                    +"Acumulado: "+ points +" \n"
                    +"                                  \n"          
                  
            );
        int seccion = 3;
        categoria.preguntar(seccion, jugs, points);
        
    
    }
    public void JugarNivel4(String jugs , int points){
  
        
      
       
      //AGREGAMOS LAS PREGUNTAS CON LAS RESPUESTAS DE LA CATEGORIA 4
       Categoria categoria = new Categoria();
       categoria.addPregunta(new Pregunta("Capital de Colombia", List.of(
       new Respuestas("Bogota", true),
       new Respuestas("Caracas", false),
       new Respuestas("Cali", false),
       new Respuestas("Medellin", false)
       )));
       categoria.addPregunta(new Pregunta("Capital de Antioquia", List.of(
       new Respuestas("Buenaventura", false),
       new Respuestas("Bogota", false),
       new Respuestas("Medellin", true),
       new Respuestas("Cartagena", false)
       )));
       categoria.addPregunta(new Pregunta("Capital de Cesar", List.of(
       new Respuestas("Soacha", false),
       new Respuestas("Villavicencio", false),
       new Respuestas("Bucaramanga", false),
       new Respuestas("Valledupar", true)
       )));
       categoria.addPregunta(new Pregunta("Capital de Bolivar", List.of(
       new Respuestas("Cordoba", false),
       new Respuestas("Cartagena", true),
       new Respuestas("Cali", false),
       new Respuestas("Cundinamarca", false)
       )));
       categoria.addPregunta(new Pregunta("Capital de Santander", List.of(
       new Respuestas("Bucaramanga", true),
       new Respuestas("Bogota", false),
       new Respuestas("Buga", false),
       new Respuestas("Cucuta", false)
       )));
       //-------------------------------------
       
        
        
        System.out.print("------------------------\n");
        
        
        System.out.print(
                    "Ronda #4 -- Gana y llevate 400 puntos\n"
                    +"Jugador: "+ jugs +"\n"
                    +"Acumulado: "+ points +" \n"
                    +"                                  \n"          
                  
            );
        int seccion = 4;
        categoria.preguntar(seccion, jugs, points);
        
    
    }
    
    public void JugarNivel5(String jugs , int points){
  
        
       
      //AGREGAMOS LAS PREGUNTAS CON LAS RESPUESTAS DE LA CATEGORIA 5
       Categoria categoria = new Categoria();
       categoria.addPregunta(new Pregunta("Cual es el lugar mas Frio de la Tierra", List.of(
       new Respuestas("Antartida", true),
       new Respuestas("Monte Everes", false),
       new Respuestas("Los Alpes", false),
       new Respuestas("Siberia", false)
       )));
       categoria.addPregunta(new Pregunta("Cual es el Rio mas largo del mundo", List.of(
       new Respuestas("Nilo", false),
       new Respuestas("Orinoco", false),
       new Respuestas("Amazonas", true),
       new Respuestas("Missisipi", false)
       )));
       categoria.addPregunta(new Pregunta("Como es el nombre de la Reina de Reino Unido", List.of(
       new Respuestas("Sofia", false),
       new Respuestas("Reina Francisca", false),
       new Respuestas("Julia la Grande", false),
       new Respuestas("Isabel II", true)
       )));
       categoria.addPregunta(new Pregunta("Que tipo de Animal es la Ballena", List.of(
       new Respuestas("Pez", false),
       new Respuestas("Mamifero", true),
       new Respuestas("Crustaceo", false),
       new Respuestas("Reptil", false)
       )));
       categoria.addPregunta(new Pregunta("Cual es la cantidad de huesos de un Humano adulto", List.of(
       new Respuestas("206", true),
       new Respuestas("306", false),
       new Respuestas("260", false),
       new Respuestas("210", false)
       )));
       //-------------------------------------
       
        
        
        System.out.print("------------------------\n");
        
        
        System.out.print(
                    "Ronda #5 -- Gana y llevate 1000 puntos\n"
                    +"Jugador: "+ jugs +"\n"
                    +"Acumulado: "+ points +" \n"
                    +"                                  \n"          
                  
            );
        int seccion = 5;
        categoria.preguntar(seccion, jugs, points);
        
    
    }

   
}
