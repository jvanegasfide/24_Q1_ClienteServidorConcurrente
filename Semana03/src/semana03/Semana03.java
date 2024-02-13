
package semana03;

public class Semana03 {

    
    public static void main(String[] args) {
        Persona[] personas = new Persona[10];
        personas[0] = new Persona();
        personas[1] = new Empleado();
        personas[2] = new Administrador();
        
//        Empleado e = new Empleado();
//        if(e instanceof Persona){
//                System.out.println("Es de tipo Persona.");
//        }

        Circulo circulo= new Circulo();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
//        
//        System.out.println("Circulo. Area: "+
//                circulo.getArea()+", Perimetro: "+
//                circulo.getPerimetro()+".");
//        System.out.println("Cuadrado. Area: "+
//                cuadrado.getArea()+", Perimetro: "+
//                cuadrado.getPerimetro()+".");
//        System.out.println("Triangulo. Area: "+
//                triangulo.getArea()+", Perimetro: "+
//                triangulo.getPerimetro()+".");
//        
        

        Avion avion = new Avion();
        Ave ave = new Ave();
        Superman superman = new Superman();
        
        avion.despegar();
        ave.despegar();
        superman.despegar();
        
    }
    
}
