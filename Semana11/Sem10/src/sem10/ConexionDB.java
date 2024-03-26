
package sem10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class ConexionDB {
    Connection conexion = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;
    
    //3 requisitos de conexion
    String username = "profeuser";
    String password = "localhost2024";
    String url = "jdbc:mysql://localhost:3306/universidad";
    
    public void SetConexion(){
        try {
            this.conexion = DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void CerrarConexion(){
        if(conexion != null){
            try {
                conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void setConsulta(String consulta){
        try {
            this.consulta = conexion.prepareStatement(consulta);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public ResultSet getResultado(){
        try {
            return consulta.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public PreparedStatement getConsulta()
    {
        return consulta;
    }
}

