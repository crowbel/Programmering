package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppg5a {
    public static void main(String[] args) {

        String måned = showInputDialog("Skriv inn månedsnavnet(kun små bokstaver):");

        if(måned.equals("juni") || måned.equals("juli") || måned.equals("august")){
            showMessageDialog(null, "Det er sommer!");
        }
        else if(måned.equals("september") || måned.equals("oktober") || måned.equals("november")){
            showMessageDialog(null, "Det er høst!");
        }
        else if(måned.equals("desember") || måned.equals("januar") || måned.equals("februar")){
            showMessageDialog(null, " Det er vinter!");
        }
        else if(måned.equals("mars") || måned.equals("april") || måned.equals("mai")){
            showMessageDialog(null,"Det er vår!");
        }
    }
}
