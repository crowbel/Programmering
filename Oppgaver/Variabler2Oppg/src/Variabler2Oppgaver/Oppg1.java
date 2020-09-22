package Variabler2Oppgaver;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Oppg1 {
    public static void main(String[]args){

        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen: ");

        int tall = Integer.parseInt(innAlder);

        showMessageDialog(null, "Min alder er " + tall + " år.");
    }
}
