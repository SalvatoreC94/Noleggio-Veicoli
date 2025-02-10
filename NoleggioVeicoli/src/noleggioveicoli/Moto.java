package noleggioveicoli;

public class Moto extends Veicolo {

    public Moto(String targa, String modello, double costoGiornaliero) {
        super(targa, modello, costoGiornaliero);
    }

    @Override
    public double calcolaCosto(int giorni) {
        return costoGiornaliero * giorni;
    }

    @Override
    public String toString() {
        return super.toString() 
                + ", Noleggi effettuati: " + noleggiEffettuati;
    }
}

