package package2;
public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;

    Auto(String marca, String modello){
        this.marca = marca;
        this.modello = modello;
    }

    Auto(String marca, String modello, String targa, int cilindrata){
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

