# Noleggio Veicoli

Questo progetto è un esercizio in Java che implementa un sistema di gestione per un parco di veicoli a noleggio. L’obiettivo è utilizzare i concetti di polimorfismo, classi astratte e interfacce per creare una soluzione flessibile ed estendibile.

## Descrizione del Progetto

Il sistema gestisce diversi tipi di veicoli, come Auto, Moto, Furgone e Bicicletta, ciascuno con le proprie specificità:
- **Auto**: può essere automatica o manuale. Se l’auto è automatica, il costo giornaliero aumenta del 10%.
- **Moto**: non prevede costi aggiuntivi.
- **Furgone**: se la capacità di carico supera 1000 kg, il costo giornaliero aumenta del 15%.
- **Bicicletta**: il costo giornaliero è ridotto del 50% rispetto al valore base.

Il sistema calcola il costo totale del noleggio in base al tipo di veicolo e al numero di giorni. Inoltre, è presente una promozione speciale che applica uno sconto del 15% se il noleggio supera 7 giorni.

### Funzionalità Principali
- **Calcolo del Costo di Noleggio**: Ogni tipo di veicolo implementa il metodo `calcolaCosto(int giorni)` in modo specifico, applicando eventuali aumenti o riduzioni.
- **Verifica della Disponibilità**: Ogni veicolo implementa l’interfaccia `Noleggiabile` con il metodo `disponibile()` per controllare se è disponibile per il noleggio.
- **Gestione del Parco Veicoli**: È possibile aggiungere veicoli, visualizzare quelli disponibili, noleggiare un veicolo e gestire la manutenzione (se un veicolo viene noleggiato più di 10 volte, viene mandato in manutenzione).
- **Calcolo del Profitto Totale**: Il sistema tiene traccia del profitto totale derivante dai noleggi.

## Tecnologie Utilizzate

- **Java 17**
- **Eclipse IDE** (o un qualsiasi IDE compatibile con Java)
- **Git** per il controllo versione

## Struttura del Progetto

Il progetto è organizzato nel package `noleggioveicoli` e include le seguenti classi:

- **Noleggiabile.java**: Interfaccia che definisce il metodo `disponibile()`.
- **Veicolo.java**: Classe astratta che definisce le proprietà comuni a tutti i veicoli (targa, modello, costo giornaliero) e il metodo astratto `calcolaCosto(int giorni)`.
- **Auto.java**: Classe derivata da `Veicolo` che gestisce il caso delle auto, con l’aggiunta della proprietà `automatica`.
- **Moto.java**: Classe derivata da `Veicolo` che rappresenta una moto.
- **Furgone.java**: Classe derivata da `Veicolo` con la proprietà `capacitaCarico` e logica per l’aumento del costo se la capacità supera i 1000 kg.
- **Bicicletta.java**: Classe derivata da `Veicolo` che applica una riduzione del 50% sul costo giornaliero.
- **PromozioneSpeciale.java**: Classe che implementa il metodo statico `calcolaSconto(Veicolo veicolo, int giorni)` per applicare uno sconto del 15% se il noleggio supera 7 giorni.
- **ParcoVeicoli.java**: Classe che gestisce l’elenco dei veicoli disponibili, il noleggio, la manutenzione e il calcolo del profitto totale.
- **NoleggioVeicoli.java**: Classe contenente il metodo `main` per l’interazione con l’utente e l’avvio del programma.

