package noleggioveicoli;

import java.util.ArrayList;
import java.util.List;

public class ParcoVeicoli {
    private List<Veicolo> veicoliDisponibili;
    private List<Veicolo> veicoliInManutenzione;
    private double profittoTotale;

    public ParcoVeicoli() {
        veicoliDisponibili = new ArrayList<>();
        veicoliInManutenzione = new ArrayList<>();
        profittoTotale = 0.0;
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        veicoliDisponibili.add(veicolo);
    }

    public void visualizzaVeicoliDisponibili() {
        System.out.println("Veicoli disponibili per il noleggio:");
        if (veicoliDisponibili.isEmpty()) {
            System.out.println("Nessun veicolo disponibile.");
        } else {
            for (Veicolo v : veicoliDisponibili) {
                if (v.disponibile()) {
                    System.out.println(v);
                }
            }
        }
    }

    public double noleggiaVeicolo(String targa, int giorni) {
        Veicolo veicoloTrovato = null;
        for (Veicolo v : veicoliDisponibili) {
            if (v.getTarga().equalsIgnoreCase(targa) && v.disponibile()) {
                veicoloTrovato = v;
                break;
            }
        }
        if (veicoloTrovato == null) {
            System.out.println("Veicolo con targa " + targa + " non disponibile per il noleggio.");
            return 0.0;
        }

        double costoNoleggio = PromozioneSpeciale.calcolaSconto(veicoloTrovato, giorni);
        profittoTotale += costoNoleggio;
        veicoloTrovato.incrementaNoleggi();

        // Segna il veicolo come non disponibile e lo rimuove dall’elenco
        veicoloTrovato.setDisponibile(false);
        veicoliDisponibili.remove(veicoloTrovato);
        System.out.println("Il veicolo " + veicoloTrovato.getTarga() + " è stato noleggiato per " + giorni + " giorni. Costo totale: " + costoNoleggio);

        // Invia in manutenzione se noleggi effettuati > 10
        if (veicoloTrovato.getNoleggiEffettuati() > 10) {
            invioManutenzione(veicoloTrovato);
            System.out.println("Il veicolo " + veicoloTrovato.getTarga() + " è stato mandato in manutenzione (noleggi effettuati: " 
                    + veicoloTrovato.getNoleggiEffettuati() + ").");
        }

        return costoNoleggio;
    }

    public void invioManutenzione(Veicolo veicolo) {
        veicoliDisponibili.remove(veicolo);
        veicolo.setDisponibile(false);
        veicoliInManutenzione.add(veicolo);
    }

    public void visualizzaProfittoTotale() {
        System.out.println("Profitto totale del parco veicoli: " + profittoTotale);
    }
}

