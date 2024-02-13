/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

/**
 *
 * @author Laboratorio
 */
public class Banca extends Silla{
    public int cantidadPersonas;
    
    public Banca(int cantidadPersonas, String Material){
        this(Material);
        this.cantidadPersonas = cantidadPersonas;
    }
    public Banca(String Material){
        super(Material);
    }
    
}
