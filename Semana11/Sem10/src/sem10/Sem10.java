
package sem10;

import java.sql.Date;


public class Sem10 {

    public static void main(String[] args) {
        GestionEstudiante estudiante = new GestionEstudiante();
        //estudiante.consultarEstudiantes();
        //estudiante.consultarEstudiantePorId(2);
        
        //estudiante.insertarEstudiante(8, "test", "test", Date.valueOf("2024-03-25"), Date.valueOf("2024-03-25"), true);
        estudiante.consultarEstudiantes();
        
        //estudiante.actualizarEstudiante(1, "prueba2@fidelitas.com", "11111",Date.valueOf("2024-03-20"), Date.valueOf("2024-03-20"), false);
        
        
        estudiante.borrarEstudiante(7);
    }
    
}
