package designPattern1;
//Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
//Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
//Crea una factory class che abbia un metodo che ritorni la forma corretta (shape) in base all'enum in input.
//Stampa a video il risultato della funzione draw di ogni shape creata
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape(ShapeType.CIRCLE);
        if (circle != null) {
            circle.draw();
        } else {
            System.out.println("Forma geometrica non valida!");
        }

        Shape rectangle = factory.createShape(ShapeType.RECTANGLE);
        if (rectangle != null) {
            rectangle.draw();
        } else {
            System.out.println("Forma geometrica non valida!");
        }

        Shape square = factory.createShape(ShapeType.SQUARE);
        if (square != null) {
            square.draw();
        } else {
            System.out.println("Forma geometrica non valida!");
        }
    }

    }
    enum ShapeType {
        CIRCLE,
        RECTANGLE,
        SQUARE
    }

    class ShapeFactory {
       public Shape createShape(ShapeType shape){
           return switch (shape){
               case CIRCLE -> new Circle();
               case RECTANGLE -> new Rectangle();
               case SQUARE -> new Square();
           };


       }
    }

