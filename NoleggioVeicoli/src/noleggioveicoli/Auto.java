package noleggioveicoli;

public class Auto extends Veicolo {
    private boolean automatica;

    public Auto(String targa, String modello, double costoGiornaliero, boolean automatica) {
        super(targa, modello, costoGiornaliero);
        this.automatica = automatica;
    }

    @Override
    public double calcolaCosto(int giorni) {
        double costo = costoGiornaliero;
        if (automatica) {
            costo *= 1.10; // Aumenta del 10% se l'auto è automatica
        }
        return costo * giorni;
    }

    @Override
    public String toString() {
        return super.toString() 
                + ", Tipo: " + (automatica ? "Automatica" : "Manuale")
                + ", Noleggi effettuati: " + noleggiEffettuati;
    }
}

