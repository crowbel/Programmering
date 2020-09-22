package KlasserObjekter1;

import static javax.swing.JOptionPane.*;

class Person{

    String navn;
    String adresse;
    String telefonNr;
    int fødselsår;
    int alder;

    public int alderUtregning(){
        alder = (2020 - fødselsår);
        return alder;
    }

    public void personUtskrift(){
        showMessageDialog(null,navn + " med adresse " + adresse +
                " med telefonnummer " + telefonNr + " er " + alderUtregning() + " år.");
    }

}

public class Oppg3 {
    public static void main(String[]args){

        /*
        String innNavn = showInputDialog("Skriv inn navnet: ");
        String innAdresse = showInputDialog("Skriv inn adressen: ");
        String innTelefonNr = showInputDialog("Skriv inn telefon nummeret: ");
        String innFødselsår = showInputDialog("Skriv inn fødselsåret: ");
        */

        String innNavn = "Per Hansen";
        String innAdresse = "Osloveien 82";
        String innTelefonNr = "99349355";
        String innFødselsår = "1998";

        int intFødselsår = Integer.parseInt(innFødselsår);

        Person newPerson = new Person();

        newPerson.navn = innNavn;
        newPerson.adresse = innAdresse;
        newPerson.telefonNr = innTelefonNr;
        newPerson.fødselsår = intFødselsår;

        newPerson.personUtskrift();



        String innNavn1 = "Mads Hansen";
        String innAdresse1 = "Osloveien 45";
        String innTelefonNr1 = "99349455";
        String innFødselsår1 = "1983";

        int intFødselsår1 = Integer.parseInt(innFødselsår1);

        Person newPerson1 = new Person();

        newPerson1.navn = innNavn1;
        newPerson1.adresse = innAdresse1;
        newPerson1.telefonNr = innTelefonNr1;
        newPerson1.fødselsår = intFødselsår1;


        newPerson1.personUtskrift();

    }
}
