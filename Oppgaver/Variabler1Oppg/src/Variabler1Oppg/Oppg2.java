package Variabler1Oppg;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Oppg2 {
    public static void main(String [] args){

        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet: ");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet: ");

        String navn = fornavn + " " + etternavn;

        String alder = JOptionPane.showInputDialog("Skriv inn alderen til " + navn + " :");

        showMessageDialog(null, "Alderen til " + navn + " er " + alder + " år." );
    }
}
