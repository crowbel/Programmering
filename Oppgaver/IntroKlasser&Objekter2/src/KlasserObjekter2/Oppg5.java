package KlasserObjekter2;

import static javax.swing.JOptionPane.*;

class Konto{

    //Attributtene for kontoinnehaveres navn, kontonummer og saldo.
    private String innehaver;
    private String kontoNr;
    private double saldo;

    // Konstruktør som skal gi startverdier til Alle attributtene
    public Konto(String innehaver, String kontoNr, double saldo){
        this.innehaver = innehaver;
        this.kontoNr = kontoNr;
        this.saldo = saldo;
    }

    //Kontoutskrifts-metode, som skriver ut kontoinnehavers navn, kontonummer og saldo i et dialogvindu.
    public void kontoUtskrift(){
        showMessageDialog(null,"Kontoinnehaver: " + innehaver + "\n"
        + "Kontonummer: " + kontoNr + "\n"
        + "Saldo: " + saldo);
    }

    /* Metode som setter inn et beløp på kontoen.
    * Beløpets størrelse skal tas imot via en parameter til metoden.
    * Metoden skal returnere en tekst som inneholder informasjon om den nye saldoen.*/

    public String innSkudd(double beløp){
        saldo = beløp + saldo;
        return "Innskudd: " + beløp + " kr" + "\n"
                + "Den nye saldoen er: " + String.format("%.2f",saldo) + " kr.";
    }

    /* Metode som tar ut et beløp fra kontoen, under forutsetning av at det er dekning for beløpet.
    * Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
    * Hvis det er dekning på kontoen, skal metoden returnede en tekst med informasjon om den nye saldoen.
    * Hvis det ikke er dekning, skal den returnerte teksen inneholde informasjon om det.
    */

    public String uttak (double beløp){
        if (saldo > beløp){
            saldo = saldo - beløp;
            return "\n" + "Uttak gjenomført... Ny saldo er: " + String.format("%.2f", saldo) + " kr";
        }
        else{
            return "\n" + "Uttak ikke gjennomført... Ikke dekning på konto. Saldo: " + saldo + " kr";
        }
    }
    // end of class
}

public class Oppg5 {
    public static void main(String[] args) {
       // Opprett et Konto-objekter, som ved opprettelsen blir tilført navn, kontonummer og saldo.

        String innInnehaver = showInputDialog("Skriv inn navnet på kontoinnehaver: ");
        String innKontonummer = showInputDialog("Skriv inn kontonummeret: ");
        double innSaldo = Double.parseDouble(showInputDialog("Skriv inn saldoen på kontoen: "));

        Konto konto1 = new Konto(innInnehaver, innKontonummer, 320560.521);

       // Test ut ALLE metodene du har laget i Konto-klassen på Konto-objektene.

        System.out.print(konto1.innSkudd(1000));
        System.out.print(konto1.uttak(10000));
        System.out.println(konto1.uttak(400000));

        konto1.kontoUtskrift();
              //Skriv resultatene av metodene ut på system.out




       /* Bruk dialogvinduer til både innlesing og utskrift av kontoinformajson*/
    }
}//end of class Kontotest
