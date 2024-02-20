
package com.mycompany.semana06;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo extends Thread {
    private int numeroHilo=5;
    private boolean continua=true;
    
 @Override
 public void run(){
     while(numeroHilo>0){
        System.out.println("Este es el ciclo: "+ numeroHilo--);
         try {
             Thread.sleep(2000);
         } catch (InterruptedException ex) {
             Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
 }
}
