/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

/**
 *
 * @author Laboratorio
 */
public class Pata {

    public Pata(int numeroPatas, String material, boolean esHueco) {
        this.numeroPatas = numeroPatas;
        this.material = material;
        this.esHueco = esHueco;
    }

    @Override
    public String toString() {
        return "Pata{" + "numeroPatas=" + numeroPatas + ", material=" + material + ", esHueco=" + esHueco + '}';
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEsHueco() {
        return esHueco;
    }

    public void setEsHueco(boolean esHueco) {
        this.esHueco = esHueco;
    }
    public int numeroPatas;
    public String material;
    public boolean esHueco;
    
    public int getPatas(){
        return this.numeroPatas;
    }
    
    public void setPatas(int valorPatas){
        this.numeroPatas = valorPatas;
    }
}
