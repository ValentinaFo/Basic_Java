package newCheckpoint;
//**Traccia:**
//Crea un programma per gestire un inventario di prodotti in un negozio.
// Dovrai definire classi per rappresentare i prodotti e gestire le operazioni come aggiunta
// di nuovi prodotti, visualizzazione dell'inventario e ricerca di prodotti per categoria.
// Utilizza un array per memorizzare le informazioni sui prodotti.
//        **Suggerimenti:**
// 1. Definisci una classe `Prodotto` che rappresenti un prodotto con attributi come nome, prezzo,
// categoria, ecc.
//        2. Implementa una classe `Negozio` che gestisca l'inventario dei prodotti utilizzando
//        un array per memorizzare le informazioni (Il negozio può contenere al massimo 1000 prodotti).
//        3. Al negozio è possibile aggiungere un prodotto
//4. Il negozio deve essere in grado di mostrare l'inventario completo dei prodotti.
//        ### Bonus
//5. Aggiungi la funzionalità di ricerca per categoria di prodotti nell'inventario.
public class Main {
    public static void main(String[] args){
        Prodotto pasta = new Prodotto("Fusilli",1.99,Categoria.ALIMENTARE);
        Prodotto vaso = new Prodotto("Vaso x", 10.99,Categoria.CASALINGHI);
        Prodotto trapano = new Prodotto("Trapano q12", 43.50,Categoria.FAIDATE);


        Negozio daVale = new Negozio();
        daVale.aggProdotto(pasta);
        daVale.aggProdotto(vaso);
        daVale.aggProdotto(trapano);
        daVale.visualizzaProdotti();
        System.out.println();

        daVale.searchForCat(Categoria.ALIMENTARE);
        System.out.println();
    }
}
