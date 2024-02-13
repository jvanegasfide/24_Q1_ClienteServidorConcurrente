/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana02;

/**
 *
 * @author Laboratorio
 */
public class Semana02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        
        empleado.setNumeroEmpleado(11);
        empleado.setPeso(62);
        //empleado.ImprimeDatos();
        
        IngenieroCivil ingeniero = new IngenieroCivil();
        ingeniero.setAltura(55);
        ingeniero.setCorreoCorporativo("ingeniero@arquitectosua.com");
        ingeniero.esSupervisor=true;
        
        ingeniero.ImprimeDatos();
        
        
        
        
        
    }
    
}
                         