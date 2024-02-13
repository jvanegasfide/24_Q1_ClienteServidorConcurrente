package semana03;

public class Superman implements Aeronave {

    public void despegar() {
        System.out.println("Superman despegando.");
    }

    public void aterrizar() {
        System.out.println("Superman aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("Superman volando.");
    }
    
}
