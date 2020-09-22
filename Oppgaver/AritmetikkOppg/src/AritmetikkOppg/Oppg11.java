package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg11 {
    public static void main(String[]args){

        String innData = showInputDialog("Skriv inn et heltall mellom 0 og 1000 :");

        int helTall = Integer.parseInt(innData);

        int ener = helTall % 10;

        int tier = (helTall / 10) % 10;

        int hundrer = helTall / 100;

        int sum = hundrer + tier + ener;

        System.out.println(helTall + " = " + hundrer + " + " + tier + " + " + ener + " har en tversum på " + sum);
    }
}
