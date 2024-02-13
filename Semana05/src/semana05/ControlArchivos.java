
package semana05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class ControlArchivos {
    private static String cedula, nombre, email, telefono;
    
    public static void agregar(){
        try {
            DataOutputStream archivo =
                    new DataOutputStream(new FileOutputStream("estudiante.txt", true));
            
            cedula = JOptionPane.showInputDialog("Ingrese su cedula");
            nombre = JOptionPane.showInputDialog("Ingrese su nombre.");
            email = JOptionPane.showInputDialog("Ingrese su email.");
            telefono = JOptionPane.showInputDialog("Ingrese su telefono.");
            
            archivo.writeUTF(cedula);
            archivo.writeUTF(nombre);
            archivo.writeUTF(email);
            archivo.writeUTF(telefono);
            
            JOptionPane.showMessageDialog(null, "Se han guardado "
                    + "correctamente los datos.");
            archivo.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no se encontró. "
                    + "Error fatal, contacte al administrador");
        } catch (IOException ex) {
            System.out.println("El dato es incorrecto para la escritura del archivo. "
                    + "Error: "+ex.getMessage());
        }
    }
    
    public static void modificar(){
        
    }
    public static void intercambiar(){
        String ced, nom, correo, tele;
        try {
            DataInputStream archivoLectura = new DataInputStream(
                    new FileInputStream("temp.txt"));
            DataOutputStream archivoEscritura = new DataOutputStream(
                    new FileOutputStream("estudiante.txt"));
            
            try {
                while(true){
                        ced = archivoLectura.readUTF();
                        nom = archivoLectura.readUTF();
                        correo = archivoLectura.readUTF();
                        tele = archivoLectura.readUTF();
                        archivoEscritura.writeUTF(ced);
                        archivoEscritura.writeUTF(nom);
                        archivoEscritura.writeUTF(correo);
                        archivoEscritura.writeUTF(tele);
                }
            } catch (EOFException ex) {
                    archivoEscritura.close();
                    archivoLectura.close();
                }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado. Error: "+ ex.getMessage());
        } catch(IOException ex){
            System.out.println("Error de ejecucion. Error: "+ ex.getMessage() + ex.getStackTrace());
        }
        
    }
    
    public static void eliminar(){
        String cedulaUsuario, ced, nom, correo, tele;
        
        cedulaUsuario = JOptionPane.showInputDialog("Ingrese el numero "
                + "de cedula a buscar");
        JOptionPane.showMessageDialog(null, cedulaUsuario);
        try {
            DataInputStream archivoLectura = new DataInputStream(
                    new FileInputStream("estudiante.txt"));
            
            DataOutputStream archivoEscritura = new DataOutputStream(
                    new FileOutputStream("temp.txt"));
            try{
                while(true){
                    ced = archivoLectura.readUTF();
                    nom = archivoLectura.readUTF();
                    correo = archivoLectura.readUTF();
                    tele = archivoLectura.readUTF();
                    
                    if(!cedulaUsuario.equals(ced)){
                        archivoEscritura.writeUTF(ced);
                        archivoEscritura.writeUTF(nom);
                        archivoEscritura.writeUTF(correo);
                        archivoEscritura.writeUTF(tele);
                    }
                }
            }
            catch(EOFException ex){
             archivoEscritura.close();
             archivoLectura.close();
             
             //intercambiar();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error en la lectura de datos: "
                    + "Error: "+ex.getMessage());
        }
        
    }
    
}
