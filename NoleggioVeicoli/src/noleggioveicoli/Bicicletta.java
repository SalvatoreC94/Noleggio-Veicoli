package noleggioveicoli;

public class Bicicletta extends Veicolo {

    public Bicicletta(String targa, String modello, double costoGiornaliero) {
        super(targa, modello, costoGiornaliero);
    }

    @Override
    public double calcolaCosto(int giorni) {
        double costo = costoGiornaliero * 0.5; // Riduzione del 50%
        return costo * giorni;
    }

    @Override
    public String toString() {
        return super.toString() 
                + " (Bicicletta)"
                + ", Noleggi effettuati: " + noleggiEffettuati;
    }
}
