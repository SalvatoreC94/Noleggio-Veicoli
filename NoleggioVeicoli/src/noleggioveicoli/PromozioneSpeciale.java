package noleggioveicoli;

public class PromozioneSpeciale {
    public static double calcolaSconto(Veicolo veicolo, int giorni) {
        double costo = veicolo.calcolaCosto(giorni);
        if (giorni > 7) {
            costo *= 0.85; // Sconto del 15%
        }
        return costo;
    }
}

