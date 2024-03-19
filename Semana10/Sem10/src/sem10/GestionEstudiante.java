package sem10;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionEstudiante {
    ConexionDB conexion = new ConexionDB();
    ResultSet resultado = null;
    
    public void consultarEstudiantes(){
        try {
            conexion.SetConexion();
            conexion.setConsulta("SELECT * FROM estudiante");
            resultado = conexion.getResultado();
            
            while(resultado.next()){
                int idEstudiante = resultado.getInt("id");
                String mail = resultado.getString("mail");
                String telefono = resultado.getString("telefono");
                
                System.out.println("Id: "+idEstudiante+ 
                        ", mail: "+mail+", telefono:"+telefono);
            }
            conexion.CerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void consultarEstudiantePorId(int id){
        try {
            conexion.SetConexion();
            conexion.setConsulta("SELECT * FROM estudiante WHERE id = "+id);
            resultado = conexion.getResultado();
            
            while(resultado.next()){
                int idEstudiante = resultado.getInt("id");
                String mail = resultado.getString("mail");
                String telefono = resultado.getString("telefono");
                
                System.out.println("Id: "+idEstudiante+
                        ", mail:"+mail+", telefono: "+telefono);
            }

            conexion.CerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
