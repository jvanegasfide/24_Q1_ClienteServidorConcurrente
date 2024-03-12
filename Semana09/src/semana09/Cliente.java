
package semana09;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    public static void main(String[] args) {
    
        //1. Crear el Socket (IP y puerto)
        //2. Crear clase de lectura de mensaje y leer el 
        //msje
        //3. Escribir respuesta y enviarla
        //4. Cerrar Mensaje
        //5. Cerrar Socket
        
        Socket socket = null;
        
        try {
            
            //1. Crear el Socket (IP y Puerto)
            socket = new Socket("127.0.0.1",8528);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        while(true){
            try {
                try {
                    DataInputStream stream = new DataInputStream(
                            socket.getInputStream());
                    System.out.println(stream.readUTF());
                    stream.close();
                    
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName())
                            .log(Level.SEVERE, null, ex);
                    
                }
                
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName())
                        .log(Level.SEVERE, null, ex);
                
            }
        }
        
    }
}
