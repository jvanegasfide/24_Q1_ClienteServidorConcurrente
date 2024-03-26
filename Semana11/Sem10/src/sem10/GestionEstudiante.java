package sem10;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
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
                String nacimiento = resultado.getString("fechaNacimiento");
                String ingreso = resultado.getString("fechaIngreso");
                
                System.out.println("Id: "+idEstudiante+ 
                         ", mail:"+mail+", telefono: "+telefono+
                        ", FechaNacimiento: "+nacimiento+ 
                        ", FechaIngreso: "+ingreso);
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
                String nacimiento = resultado.getString("fechaNacimiento");
                String ingreso = resultado.getString("fechaIngreso");
                
                System.out.println("Id: "+idEstudiante+
                        ", mail:"+mail+", telefono: "+telefono+
                        ", FechaNacimiento: "+nacimiento+ 
                        ", FechaIngreso: "+ingreso);
            }

            conexion.CerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void insertarEstudiante(int id, String mail, 
            String telefono, Date fechaNacimiento, Date fechaIngreso, boolean activo){
        try {
            //1. conectar contra DB
            conexion.SetConexion();
            
            //metodo #1
            String query =  "INSERT INTO estudiante("+
                    "id,mail,telefono,fechaNacimiento,fechaIngreso,esActivo)"+
                    "VALUES("+
                    id+",'"+mail+"','"+telefono+"','"+fechaNacimiento+"' ,'"+fechaIngreso+"' ,"+activo+")";
            
            //metodo #2
            query = "INSERT INTO estudiante("+
                    "id,mail,telefono,fechaNacimiento,fechaIngreso,esActivo)"+
                    "VALUES(?,?,?,?,?,?)";
            
            //2. Procesar query SQL
            conexion.setConsulta(query);
            //Estudiante a = new Estudiante();
            
            conexion.getConsulta().setString(1,id+"");
            conexion.getConsulta().setString(2,mail);
            conexion.getConsulta().setString(3,telefono);
            conexion.getConsulta().setString(4,fechaNacimiento.toString());
            conexion.getConsulta().setString(5,fechaIngreso.toString());
            conexion.getConsulta().setBoolean(6,activo);
            
            
            //3. ejecutar script y guardar respuesta
            if(conexion.getConsulta().executeUpdate() > 0){
                System.out.println("Se insertó el record con id:"+ id);
            }            
            //4. Cerrar conexion
            conexion.CerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void actualizarEstudiante(int id, String mail, 
        String telefono, Date fechaNacimiento, Date fechaIngreso, boolean activo){
          
        try {
            //1. encuentra el estudiante
            conexion.SetConexion();
            conexion.setConsulta("SELECT * FROM estudiante WHERE id = "+id);
            resultado = conexion.getResultado();
            
            while(resultado.next()){
                int idEstudiante = resultado.getInt("id");
                String mailEstudiante = resultado.getString("mail");
                String telefonoEstudiante = resultado.getString("telefono");
                String nacimientoEstudiante = resultado.getString("fechaNacimiento");
                String ingresoEstudiante = resultado.getString("fechaIngreso");
                
                System.out.println("Estudiante encontrado:"
                        + "Id: "+idEstudiante+
                        ", mail:"+mail+", telefono: "+telefono+
                        ", FechaNacimiento: "+nacimientoEstudiante+ 
                        ", FechaIngreso: "+ingresoEstudiante);
                
                //Actualizar estudiante
                conexion.setConsulta("UPDATE estudiante " +
                            "SET "+
                        "mail = ?," +
                        "fechaNacimiento = ?," +
                        "fechaIngreso = ?," +
                        "telefono = ?," +
                        "esActivo = ? " +
                        "WHERE id = "+idEstudiante);
                
                //columna
                conexion.getConsulta().setString(1,mail);
                //valor
                //conexion.getConsulta().setString(2,);
                
                //columna
                conexion.getConsulta().setString(2,fechaNacimiento.toString());
                //valor
                //conexion.getConsulta().setString(4,);
                
                //columna
                conexion.getConsulta().setString(3,fechaIngreso.toString());
                //valor
                //conexion.getConsulta().setString(6,);
                
                //columna
                conexion.getConsulta().setString(4,telefono);
                //valor
                //conexion.getConsulta().setString(8,);
                
                //columna
                conexion.getConsulta().setBoolean(5,activo);
                //valor
                
                 if(conexion.getConsulta().executeUpdate() > 0){
                    System.out.println("Se actualizo el record con id:"+ id);
                } 
            }

            conexion.CerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(GestionEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void borrarEstudiante(int id){
        try {
            conexion.SetConexion();
            conexion.setConsulta("DELETE FROM estudiante WHERE id = "+id);
            
            if(conexion.getConsulta().executeUpdate() > 0){
                System.out.println("Se borró el estudiante: "+id);
            }    
            conexion.CerrarConexion();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
}
