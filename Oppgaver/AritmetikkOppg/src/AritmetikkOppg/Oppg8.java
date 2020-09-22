package AritmetikkOppg;

public class Oppg8 {
    public static void main(String[]args){

        double tall1 = 1;
        double tall2 = 2;

        double resultat;
        resultat = tall1 * 4 + (tall2 * 2 + tall1) / (tall2 - tall1 * 3);
        System.out.println(resultat);

        //Resultet = -1. Regnestykket skrevet kun med tall ser slik ut: 1 * 4 + (2*2+1) / (2-1*3) = 4 + (4 + 1) / (2-3) = 4 + 5 / -1

        //Husk på regnerekkefølgen! Alltid fra venstre mot høyre.
        //Alt inni paranteser først, deretter multiplikasjon og divisjon. Således addisjon og subtraksjon.
    }
}
