package KlasserObjekter1;

import static javax.swing.JOptionPane.*;

class Boka{

    public String tittel;

    public double pris;

    public String forfatter;

    public String iSBN;


    public void printBoka(){
        showMessageDialog(null, "Tittel: " + tittel + "\n"
        + "Pris: " + pris + "\n"
        + "Forfatter: " + forfatter + "\n"
        + "iSBN-nummer: " + iSBN);
    }
}

public class Oppg2 {
    public static void main(String[]args){
        Boka newBoka = new Boka();
        newBoka.tittel = showInputDialog("Skriv inn tittelen på boken: ");

        String innPris = showInputDialog("Skriv inn prisen på boken: ");
        double pris = Integer.parseInt(innPris);
        newBoka.pris = pris;

        newBoka.forfatter = showInputDialog("Skriv inn forfatteren av boka: ");
        newBoka.iSBN = showInputDialog("Skriv inn iSBN-nummeret til boka: ");

        newBoka.printBoka();
    }
}
