package semana09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor {
     public static void main(String[] args) {
        //Pasos para conexion
        //1. Crear ServerSocket
        //2. Aceptar conexion de Socket
        //3. Leer mensaje/trafico del Socket
        //4. Ejecutar logica de negocio / enviar respuesta
        //5. Cerrar socket
        
        
        //1. Server Socket
        ServerSocket socket = null;
        
         try {
             //2. Instanciar Socket

             socket = new ServerSocket(8528);
         } catch (IOException ex) {
             Logger.getLogger(Servidor.class.getName())
                     .log(Level.SEVERE, null, ex);
         }
         while(true){
            try {
                //3. Aceptar conexion de Socket
                Socket s = socket.accept();

                //4. Leer mensaje
                DataOutputStream mensaje = 
                        new DataOutputStream(
                                s.getOutputStream());

                // 4 -> escribir mensaje y enviar respuesta
                mensaje.writeUTF("Mensaje recibido con exito.");

                // 4-> cerrar interaccion de mensaje
                mensaje.close();

                //5. Cierra conexion de socket
                s.close();


            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
         
        }
    }
}
