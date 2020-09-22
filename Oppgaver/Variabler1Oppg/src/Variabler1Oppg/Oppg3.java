package Variabler1Oppg;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Oppg3 {
    public static void main(String [] args){

        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet: ");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet: ");

        String navn = fornavn + " " + etternavn;

        String alder = JOptionPane.showInputDialog("Skriv inn alderen til " + navn );

        String adresse = JOptionPane.showInputDialog("Skriv inn adressen til " + navn);
        String poststed = JOptionPane.showInputDialog("Skriv inn poststedet til " + navn);
        String postNr = JOptionPane.showInputDialog("Skriv inn postnummeret til " + navn);

        showMessageDialog(null, navn + " bor i " + adresse +
                " som har postnummer "+ postNr + " i " + poststed + ". Alderen hans er " + alder + " år.");

    }
}
