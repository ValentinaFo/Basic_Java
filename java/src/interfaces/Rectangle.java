package interfaces;

class Rectangle implements Forma {
    protected int base = 4;
    protected int alt = 5;
    protected int area = base * alt;

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", alt=" + alt +
                ", area=" + area +
                '}';
    }

    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + area);
    }
}
