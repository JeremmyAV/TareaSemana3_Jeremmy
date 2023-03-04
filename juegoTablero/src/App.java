import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Juego de tablero.");

        Ficha f1 = new Ficha("rojo");


        Dado d1 = new Dado(5);
        System.out.println( d1.getCaras());

        
        System.out.println( f1.getPosicion());
        System.out.println( f1.getColor());
        System.out.println( f1.getCarasDado());

        f1.avanzar();

        Tablero t1 = new Tablero(50);

        System.out.println( t1.getFicha(4).getColor());

        // generar numeros aleatorios
        int numeroRandom = (int)(Math. random()*4+1);
        System.out.println("nuemro random");
        System.out.println( numeroRandom);


        System.out.println("Lanza dado :");
        System.out.println(d1.lanzar());
  
        
        System.out.println("cantidad de casillas:");
        System.out.println(t1.getCantCas());

        Integer pru1[];
        pru1 = new Integer[3];

        int x1 = 1;
        int x2 = 6;
        int x3 = 8;

        pru1[0] = x1;
        pru1[1] = x2;
        pru1[2] = x3;

        Integer pru2[];
        pru2 = pru1;
        System.out.println(pru2[2]);


        t1.iniciarJuego();

    }
}
