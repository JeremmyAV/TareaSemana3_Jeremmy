public class Dado {

    private Integer caras;
    private Integer rnd = 42;


    public Dado(Integer s){
        this.caras = s;
    }

    public Integer lanzar(){
        int numRandom = (int)(Math. random()*caras+1);
        return numRandom;
    }

    public Integer getCaras(){
        return caras;
    }
}
