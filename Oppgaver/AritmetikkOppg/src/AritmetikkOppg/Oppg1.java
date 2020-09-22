package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg1 {
    public static void main(String [] args){

        String navn = showInputDialog("Skriv inn navnet:");
        String innAlder = showInputDialog("Skriv inn alderen:");

        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2018 - alder;
        int pensjonsÅr = 2018 + 67;

        showMessageDialog(null, navn + " er i dag " + alder + " år. Han er født i " + fødselsår + ". I " +
                pensjonsÅr + " er han 67 år og da vil han være pensjonist.");
    }
}
