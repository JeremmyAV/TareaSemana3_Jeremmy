public class Ficha {
    
    private Dado dado1;
    private String color;
    private Integer posicion = 0;



    public Ficha(String c){
        this.color = c;
        dado1 = new Dado(6);
    }

    public void avanzar(){
        Integer pasos;
        pasos = dado1.lanzar();
        this.posicion += pasos;

        System.out.println( "La ficha " + color + " se movio a la casilla:");
        System.out.println(posicion);
    }

    public Integer getPosicion(){
        return posicion;
    }

    public String getColor(){
        return color;
    }

    public Integer getCarasDado(){
        return dado1.getCaras();
    }
}
