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




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;



public class Historial {
    
    
    
    //CAMBIAR POR UNA DIRECCION LOCAL, DE TU EQUIPO PARA REALIZAR TEST
    String carpeta = "C:\\Users\\DJ Solutions 2\\Documents\\";
    
    
    public void CrearCarpeta()
    {
        File car = new File(carpeta);
        
        if(!car.exists())
        {     
            car.mkdir();
        }
    }
    
     public void AgregarHistorial(String user, int acumulado){
        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"historial.txt");
            
            BufferedWriter bw;      
            
            bw = new BufferedWriter(new FileWriter(archivo, true));     
            
                String datos = "Jugador: " + user + " / " + "Total Puntos:" + String.valueOf(acumulado) ;
                bw.write(datos); 
                bw.newLine();
  
            bw.close();         
            
        }catch(Exception ex)
        {
            
        }

    }
     
     public void listHistorial()
    {
        try
        {
            CrearCarpeta();
            File archivo = new File(carpeta+"historial.txt");
            
            if(!archivo.exists())
            {
                archivo.createNewFile();
            }

            BufferedReader br;
            
            br = new BufferedReader(new FileReader(archivo));                         
            String linea;
            
            System.out.print("--HISTORIAL JUGADORES Y PUNTOS--- \n");
            
            while((linea = br.readLine())!= null)
            {
                System.out.print(linea);
                System.out.print(" \n");
            }
            br.close(); 
            
            System.out.print("--*******************--- \n");
            
            
        }catch(Exception ex)
        {
            
        }
        
        
    }
     
}
