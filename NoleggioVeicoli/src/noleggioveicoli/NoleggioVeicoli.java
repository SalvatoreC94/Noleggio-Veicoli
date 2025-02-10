package noleggioveicoli;

import java.util.Scanner;

public class NoleggioVeicoli {
    public static void main(String[] args) {
        ParcoVeicoli parco = new ParcoVeicoli();

        // Aggiunta dei veicoli al parco
        parco.aggiungiVeicolo(new Auto("AB123CD", "Fiat Punto", 50.0, true));
        parco.aggiungiVeicolo(new Moto("EF456GH", "Yamaha MT-07", 40.0));
        parco.aggiungiVeicolo(new Furgone("IJ789KL", "Mercedes Sprinter", 80.0, 1200));
        parco.aggiungiVeicolo(new Bicicletta("MN012OP", "Bici da Corsa", 10.0));

        // Visualizza veicoli disponibili prima del noleggio
        parco.visualizzaVeicoliDisponibili();

        // Simula il noleggio: inserisci targa e numero di giorni
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInserisci la targa del veicolo da noleggiare: ");
        String targa = scanner.nextLine();
        System.out.print("Inserisci il numero di giorni di noleggio: ");
        int giorni = scanner.nextInt();

        // Effettua il noleggio e calcola il costo totale
        parco.noleggiaVeicolo(targa, giorni);

        // Visualizza il profitto totale aggiornato
        parco.visualizzaProfittoTotale();

        // Visualizza i veicoli disponibili dopo il noleggio
        System.out.println("\nElenco aggiornato dei veicoli disponibili:");
        parco.visualizzaVeicoliDisponibili();

        scanner.close();
    }
}

