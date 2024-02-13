/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Laboratorio
 */
public class Semana04 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(1995,5);
        /*Scanner scanner = new Scanner(System.in);
        String annio = scanner.nextLine();
        String mes = scanner.nextLine();
        System.out.println(estudiante.CalcularEdad(annio, mes));
        */
        
        ArrayList arreglo = new ArrayList();
        arreglo.add(1);
        arreglo.add(1);
        arreglo.add(1);
        
        //System.out.println(arreglo.toString());
        
        Set set = new HashSet();
        set.addAll(arreglo);
        //System.out.println(set.toString());
        
        System.out.println(estudiante.compareTo(2000));
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        lista.add(2);
        lista.add(15);
        
        
        ArrayList lista2 = new ArrayList();
        lista2.add(2);
        lista2.add(15.f);
        lista2.add(estudiante);
    }
    
}
