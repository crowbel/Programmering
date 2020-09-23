package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppg4 {
    public static void main(String[] args) {

        String innAlder = showInputDialog("Skriv inn alderen din:");
        int alder = Integer.parseInt(innAlder);
        int maksAlder = 70;

        if(alder < 18){
            showMessageDialog(null, "Du er for ung til å ta førerkort på bil");
        }else if(alder >= maksAlder){
            showMessageDialog(null,"Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }else{
            showMessageDialog(null,"Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        }

    }
}
