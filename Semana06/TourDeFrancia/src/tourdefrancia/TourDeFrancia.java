/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tourdefrancia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laboratorio
 */
public class TourDeFrancia {

    
    public static void main(String[] args) {
        int cantidadCiclistas = 10;
        
        Ciclista[] ciclistas = new Ciclista[10];
        
        for(int i=0; i<cantidadCiclistas; i++){
           
            ciclistas[i] = new Ciclista("Ciclista "+i);
            ciclistas[i].start();
        }
        
        for(int i=0; i<cantidadCiclistas; i++){
            try {
                ciclistas[i].join();
            } catch (InterruptedException ex) {
                System.out.println("Hubo un error en la union al peloton.");
                ex.printStackTrace();
            }
        }
        
        
        ArrayList<Ciclista> podio = new ArrayList<>();
        for(Ciclista ciclista : ciclistas){
            podio.add(ciclista);
        }
        
        podio.sort(Comparator.comparingInt(Ciclista::getTiempoCarrera));
        
        System.out.println("Podio de la carrera: ");
        for(int i=0; i<podio.size();i++){
            Ciclista posicion = podio.get(i);
            System.out.println("Posicion # "+(i+1)+" es el ciclista: "+
                    posicion.getNombre()+ " y logro u n  tiempo "+
                    posicion.getTiempoCarrera()+".");
        }
    }
    
}
