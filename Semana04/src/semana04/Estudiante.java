/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana04;

public class Estudiante implements Comparable {
    public int annio; //year
    public int mes;

    public Estudiante(int annio, int mes){
        this.annio = annio;
        this.mes = mes;
    }
    
    public int CalcularEdad(String annioString, String mesString){
        int edad=0;
        try{
        int annio = Integer.parseInt(annioString);
        int mes = Integer.parseInt(mesString);
        int meses = 0;
        for(int i=annio; i>this.annio; i--){
            int a = annio/mes;
            for(int m=mes; m>0; m--){
            meses=+1;
                if(meses==12){
                edad=+1;
                meses=0;
                }
            }
        }
        }catch(NumberFormatException e){
            System.out.println("Valores de nacimiento "
                    + "inconvertibles a valor numerico.");
        }catch(Exception e){
            System.out.println("Ha ocurrido un error. }"
                    + "Contacte al administrador");            
            System.out.println(e.getMessage());
        }
        return edad;
    }

    @Override
    public int compareTo(Object o) {
    int edad =  (int)o - annio;
    if(edad==0){
        return 0;
    }else{
        return 1;
    }
    }
}