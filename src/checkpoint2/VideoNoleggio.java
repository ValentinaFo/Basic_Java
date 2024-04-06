package checkpoint2;

import java.util.Arrays;

public class VideoNoleggio {
    private Film[] inventario = new Film[500];

    private int filmPresenti = 0;
    private String nome;


    public VideoNoleggio(String nome) {
        this.nome = nome;
    }

    public void addFilm(Film film) {
        if (filmPresenti < inventario.length) {
            inventario[filmPresenti++] = film;
            System.out.println("Il film è stato aggiunto");

//            //for (int i = 0; i < this.inventario.length; i++) {
//                if (this.inventario[i] == null) {
//                    this.inventario[i] = film;
//                    filmPresenti++;
//                    break;
//                }

//            }

        } else {
            System.out.println("Il videonoleggio è pieno!");
        }
    }

    public void printInvent() {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null) {
                System.out.println(inventario[i]);


            }
        }
    }

    public void searchForGenre(Genere x) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null) {
                if (inventario[i].getGenere().equals(x)) {
                    System.out.println(inventario[i]);
                }
            }
        }
    }
    public void removeFilm(Film film){
        Film[] tempArray = new Film[inventario.length - 1];
        int j = 0;
        for(int i = 0; i < inventario.length; i++){
          if(!film.equals(inventario[i])&& inventario[i]!= null){
                tempArray[i] = inventario[i];
                j ++;
            }
        }inventario = tempArray;
        System.out.println("L'auto è stata eliminata " + film);

    }
}

