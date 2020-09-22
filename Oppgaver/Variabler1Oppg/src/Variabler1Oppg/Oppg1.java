package Variabler1Oppg;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Oppg1 {
    public static void main(String [] args){

        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet: ");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet: ");

        System.out.println(fornavn + " " + etternavn);

       showMessageDialog(null,"Navnet er " + fornavn + " " + etternavn);
    }
}
