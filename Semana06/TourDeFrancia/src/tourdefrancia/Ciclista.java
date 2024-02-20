
package tourdefrancia;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ciclista extends Thread {
   private String nombre;
   private int distanciaRecorrida;
   private int tiempoCarrera;

    public Ciclista(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
   
    @Override
    public void run(){
        int meta = 100;
        Random random= new Random();
        
        while(distanciaRecorrida<meta){
            //genera distancia avanzada
            int distanciaControl = random.nextInt(10)+1;
            distanciaRecorrida+=distanciaControl;
            System.out.println(nombre + " ha recorrido "
                    + distanciaControl+" kms.");
            try {
                Thread.sleep(3000);
                //aumenta los segundos.
                tiempoCarrera+=10; 
            } catch (InterruptedException ex) {
                System.out.println("Error de ejecucion: ");
                ex.printStackTrace();
            }
        }
        System.out.println(nombre + "ha cruzado la meta, "
                + "finalizo el tour.");
    }
   
}
