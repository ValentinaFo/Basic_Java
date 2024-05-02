package abstractClass;

public class Rettangolo extends Forma{
    int base = 6;
    int altezza = 3;
    int area = base * altezza;
    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + area);
    }
}
