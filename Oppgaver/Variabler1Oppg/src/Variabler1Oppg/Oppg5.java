package Variabler1Oppg;

import javax.swing.*;

public class Oppg5 {
    public static void main(String [] args){

        String navn = JOptionPane.showInputDialog("Skriv inn det fulle navnet: ");
        String adresse = JOptionPane.showInputDialog("Skriv inn adressen: ");
        String postNr = JOptionPane.showInputDialog("Skriv inn postnummeret: ");
        String postSted = JOptionPane.showInputDialog("Skriv inn poststedet: ");
        String alder = JOptionPane.showInputDialog("Skriv inn alderen: ");

        System.out.println("Navn: " + navn + "\n"
                + "Adresse: " + adresse + "\n"
                + "Postnummer: " + postNr + "\n"
                + "Poststed: " + postSted + "\n"
                + "Alder: " + alder);

    }
}
