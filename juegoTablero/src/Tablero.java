public class Tablero {
    private Ficha jugadores[];
    private Ficha jugadores2 [];
    private Integer cantCasillas;

    public Tablero(int f){

        // asignar las fichas al arreglo de jugadores

        cantCasillas = f;

        jugadores = new Ficha[5];

        Ficha f0 = new Ficha("rojo");
        jugadores[0] = f0;

        Ficha f1 = new Ficha("azul");
        jugadores[1] = f1;

        Ficha f2 = new Ficha("verde");
        jugadores[2] = f2;

        Ficha f3 = new Ficha("amarillo");
        jugadores[3] = f3;

        Ficha f4 = new Ficha("morado");
        jugadores[4] = f4;


        // hacer el arreglo en orden aleatorio
        jugadores2 = new Ficha[5];


        for (Integer i = 0; i <= 4; i++ ){
            while (jugadores2[i] == null){
                int NR1 = (int)(Math. random()*5);

                if (jugadores[NR1]!=null){
                    jugadores2[i] = jugadores[NR1];
                    jugadores[NR1] = null;
                }
            }
        }
        jugadores = jugadores2;


    }

    public void iniciarJuego(){
        System.out.println("-------------El juego acabad de comenzar-------------");
        int fin = 0;
        int ron = 1;
        int ganador = 0;
        while (fin == 0){
            System.out.println("Ronda");
            System.out.println(ron);
            ron++;
            System.out.println(" ");

            for (Integer i = 0; i < 5; i++){
                jugadores[i].avanzar();

                if (jugadores[i].getPosicion() >= cantCasillas){
                    fin = 1;
                    ganador = i;
                    System.out.println("-------------Tenemos un ganador-------------");
                    break;
                }
            }
            System.out.println(" ");
        }

        System.out.println("El ganador es:");
        System.out.println(jugadores[ganador].getColor());
    
    }

    public Ficha getFicha(Integer i){
        return jugadores[i];
    }

    public Integer getCantCas(){
        return cantCasillas;
    }

    public void getJugadores(){
        System.out.println("Lista de jugadores");
        for (Integer i = 0; i < 5; i++){
            System.out.println(jugadores[i].getColor());
        }
    }
}
