package semana09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorMultihilo {

    public static void main(String[] args) {
        ServerSocket socket = null;

        try {
            socket = new ServerSocket(8528);
        } catch (IOException ex) {
            Logger.getLogger(ServidorMultihilo.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        while (true) {
            try {
                final Socket s = socket.accept();
                new Thread(new Runnable() {

                    public void run() {
                        startServer(s);
                    }
                }).start();
            } catch (IOException ex) {
                Logger.getLogger(ServidorMultihilo.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void startServer(Socket socket) {

        try {
             DataOutputStream mensaje = 
                        new DataOutputStream(
                                socket.getOutputStream());

                // 4 -> escribir mensaje y enviar respuesta
                mensaje.writeUTF("Mensaje recibido con exito.");
                
                System.out.println("Mensaje recibido en el servidor.");
                socket.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ServidorMultihilo.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
    }

}
