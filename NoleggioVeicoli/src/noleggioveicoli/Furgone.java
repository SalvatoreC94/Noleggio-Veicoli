package noleggioveicoli;

public class Furgone extends Veicolo {
    private int capacitaCarico; // in kg

    public Furgone(String targa, String modello, double costoGiornaliero, int capacitaCarico) {
        super(targa, modello, costoGiornaliero);
        this.capacitaCarico = capacitaCarico;
    }

    @Override
    public double calcolaCosto(int giorni) {
        double costo = costoGiornaliero;
        if (capacitaCarico > 1000) {
            costo *= 1.15; // Aumento del 15% se la capacità supera 1000 kg
        }
        return costo * giorni;
    }

    @Override
    public String toString() {
        return super.toString() 
                + ", Capacità Carico: " + capacitaCarico + " kg"
                + ", Noleggi effettuati: " + noleggiEffettuati;
    }
}

