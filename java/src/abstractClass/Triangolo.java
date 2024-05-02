package abstractClass;

public class Triangolo extends Forma{
    int base = 3;
    int altezza = 5;
    int area = base * altezza /2;

    @Override
    void calcolaArea() {
        System.out.println("L'area del triangolo è: " + area);

    }
}
