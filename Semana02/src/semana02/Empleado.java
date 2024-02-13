/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

/**
 *
 * @author Laboratorio
 */
public class Empleado extends Persona {
    private int NumeroEmpleado;
    private String CorreoCorporativo;
    
    public void ImprimeDatos(){
        System.out.println("Numero de Empleado: "+
                this.NumeroEmpleado
                +", Correo Corporativo: "+
                this.CorreoCorporativo+", Peso: "+this.getPeso());
    }

    public int getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public void setNumeroEmpleado(int NumeroEmpleado) {
        this.NumeroEmpleado = NumeroEmpleado;
    }

    public String getCorreoCorporativo() {
        return CorreoCorporativo;
    }

    public void setCorreoCorporativo(String CorreoCorporativo) {
        this.CorreoCorporativo = CorreoCorporativo;
    }
}
