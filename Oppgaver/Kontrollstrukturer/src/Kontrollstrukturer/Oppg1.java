package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppg1 {
    public static void main(String[] args) {

        String innAlder = showInputDialog("Skriv inn alderen din:");
        int alder = Integer.parseInt(innAlder);
        if(alder < 18){
            showMessageDialog(null,"Du er ikke myndig!");
        }
        if(alder >= 17 && alder < 20){
            showMessageDialog(null, "Du er myndig, men kan ikke kjøpe alkohol med mer enn 22% på polet");
        }
        if(alder >= 20){
            showMessageDialog(null, "Du er gammel nok til å kjøpe hva du vil på polet");
        }
    }
}
