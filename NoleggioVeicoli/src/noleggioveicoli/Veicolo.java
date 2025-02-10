package noleggioveicoli;

public abstract class Veicolo implements Noleggiabile {
    protected String targa;
    protected String modello;
    protected double costoGiornaliero;
    protected boolean disponibile;
    protected int noleggiEffettuati;

    public Veicolo(String targa, String modello, double costoGiornaliero) {
        this.targa = targa;
        this.modello = modello;
        this.costoGiornaliero = costoGiornaliero;
        this.disponibile = true;
        this.noleggiEffettuati = 0;
    }

    public abstract double calcolaCosto(int giorni);

    @Override
    public boolean disponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public String getTarga() {
        return targa;
    }

    public int getNoleggiEffettuati() {
        return noleggiEffettuati;
    }

    public void incrementaNoleggi() {
        this.noleggiEffettuati++;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [Targa: " + targa 
                + ", Modello: " + modello 
                + ", Costo Giornaliero: " + costoGiornaliero + "]";
    }
}

