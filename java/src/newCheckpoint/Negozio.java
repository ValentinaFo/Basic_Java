package newCheckpoint;

public class Negozio {
    private Prodotto[]  prodottiStore = new Prodotto[1000];
    private int numProd;

    public void visualizzaProdotti(){
        for(Prodotto p : prodottiStore) {
            if (p != null) {
                System.out.println(p);
            }
        }

    }
    public void aggProdotto(Prodotto newProdotto){
        for(int i = 0; i < prodottiStore.length; i++){
            if(prodottiStore[i] == null){
                prodottiStore[i] = newProdotto;
                numProd++;
                break;

            }
        }
    }
    public void searchForCat(Categoria cat){
        for(int i = 0; i< prodottiStore.length; i++){
            if(prodottiStore[i]!=null && prodottiStore[i].getCategoria().equals(cat)){
                System.out.println(prodottiStore[i]);
            }
        }
    }
}
