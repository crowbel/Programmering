package Variabler2Oppgaver;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class Oppg3 {
    public static void main(String [] args){

        String innTall1 = JOptionPane.showInputDialog("Skriv inn et desimaltall: ");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn et desimaltall: ");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn et desimaltall: ");

        double tall1 = Double.parseDouble(innTall1);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double tall = tall1 + tall2 + tall3 / 3;

        System.out.print(tall);

        showMessageDialog(null, "Gjennomsnittet av " + tall1 + " , " + tall2 + " og " + tall3 + " er: " + tall);
    }
}
