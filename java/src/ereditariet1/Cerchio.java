package ereditariet1;

public class Cerchio extends Forma{

    public Cerchio(int raggio) {
        super(1, 0, raggio);

    }
    @Override
    public float calcolaArea(){
        return (float) ((altezzaLato * altezzaLato) * Math.PI);
    }
}
