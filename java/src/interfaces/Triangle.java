package interfaces;

public class Triangle implements Forma {
    protected int base = 5;
    protected int alt = 3;
    protected int area = base * alt /2;


    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + area);
    }
}
