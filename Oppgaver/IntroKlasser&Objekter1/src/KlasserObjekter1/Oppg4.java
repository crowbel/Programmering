package KlasserObjekter1;

import static javax.swing.JOptionPane.*;

class Personer{

    String navn;
    String adresse;
    String telefonnr;
    int fødselsår;

    int alder;

    public int alderUtregning(){
        alder = 2020 - fødselsår;
        return alder;
    }

    public void personerUtskrift(){
        showMessageDialog(null,navn + " med adresse " + adresse +
                " med telefonnummer " + telefonnr + " er " + alderUtregning() + " år.");
    }


}

public class Oppg4 {
    public static void main(String[]args){

        String innNavn = showInputDialog("Skriv inn navnet: ");
        String innAdresse = showInputDialog("Skriv inn adressen: ");
        String innTelefonNr = showInputDialog("Skriv inn telefonnummeret: ");
        String innFødselsår = showInputDialog("Skriv inn fødselsåret: ");

        int intFødselsår = Integer.parseInt(innFødselsår);

        Personer newPersoner = new Personer();

        newPersoner.navn = innNavn;
        newPersoner.adresse = innAdresse;
        newPersoner.telefonnr = innTelefonNr;
        newPersoner.fødselsår = intFødselsår;

        newPersoner.personerUtskrift();

    }
}
