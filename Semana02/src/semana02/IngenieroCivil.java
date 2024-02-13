/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

/**
 *
 * @author Laboratorio
 */
public class IngenieroCivil extends Empleado{
    public boolean esSupervisor;
    
    @Override
    public void ImprimeDatos(){
        System.out.println("Correo Corporativo: "+
                this.getCorreoCorporativo()+
                ", Numero de empleado: "+
                this.getNumeroEmpleado()+
                ", Es Supervisor?: "+
                this.esSupervisor);
    }
}
