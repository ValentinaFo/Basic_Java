package checkpoint2;
/*Traccia:
Realizza un programma per gestire un inventario di film in un videonoleggio. Ogni film deve avere un titolo,
un regista, un anno di uscita e un genere. Implementa un sistema per aggiungere nuovi film,
visualizzare l'inventario completo dei film e cercare film per genere. Utilizza un array per memorizzare le informazioni sui film.
Suggerimenti:
Definisci una classe Film che rappresenti un film con attributi come titolo, regista, anno di uscita e genere.
Implementa una classe Videonoleggio che gestisca l'inventario dei film utilizzando un array per
memorizzare le informazioni (Il videonoleggio può contenere al massimo 500 film).
Al videonoleggio è possibile aggiungere dei Film
Il videonoleggio deve essere in grado di mostrare l'inventario completo dei film.
Bonus
Aggiungi la funzionalità di ricerca per genere di film nell'inventario.*/

public class Main {
    public static void main(String[] args){
       Film f1 = new Film("Pietro Castellitto","Enea",2024,Genere.ROSA);
       Film f2 = new Film("Adam Wingard","Godzilla e Kong - Il Nuovo Impero",
                2024,Genere.AVVENTURA);
        Film film3 = new Film("Yorgos Lanthimos","Nimic",2023,
                Genere.DRAMMATICO);
        Film film4 = new Film(" Makbul Mubarak","Autobiography - Il ragazzo e il generale",
                2023,Genere.THRILLER);

        VideoNoleggio newClient = new VideoNoleggio("Vale");
        newClient.addFilm(f1);
        newClient.addFilm(film3);
        newClient.printInvent();
        System.out.println();

        VideoNoleggio myVideo = new VideoNoleggio("Ciccio");
        myVideo.addFilm(f1);
        myVideo.addFilm(f2);
        myVideo.printInvent();
        System.out.println();

        myVideo.searchForGenre(Genere.ROSA);
        myVideo.removeFilm(f1);
    }
}


