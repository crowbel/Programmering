package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppg3 {
    public static void main(String[]args){

        String innAlder = showInputDialog("Skriv inn alderen din:");
        int alder = Integer.parseInt(innAlder);

        if(alder < 18){
            showMessageDialog(null, "Du er for ung til å ta førerkort på bil.");
        }else{
            showMessageDialog(null,"Du er gammel nok til å ta førerkort på bil.");
        }
    }
}
