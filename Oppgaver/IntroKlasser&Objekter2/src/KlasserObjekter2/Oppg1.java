package KlasserObjekter2;

import static javax.swing.JOptionPane.*;

public class Oppg1 {

    static class Person{

        private String fornavn;
        private String etternavn;
        private String adresse;
        private String telefonNr;

        public Person(String fornavn, String etternavn,String adresse,String telefonNr){
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.adresse = adresse;
            this.telefonNr = telefonNr;
        }

        public String getFornavn(){ return fornavn; }

        public void setFornavn(String fornavn){ this.fornavn = fornavn; }


        public String getEtternavn(){ return etternavn; }

        public void setEtternavn(){ this.etternavn = etternavn; }


        public String getAdresse(){ return adresse; }

        public void setAdresse(){ this.adresse = adresse; }


        public String getTelefonNr(){ return telefonNr; }

        public void setTelefonNr(){ this.telefonNr = telefonNr; }


        public void skrivUt(){
            String ut = "Navn: " + fornavn + "\n"
                    + "Etternavn: " + etternavn + "\n"
                    + "Adresse: " + adresse + "\n"
                    + "Telefonnr: " + telefonNr;
            showMessageDialog(null,ut);
        }
    }


    public static void main(String[] args) {

        String innFornavn = showInputDialog("Skriv inn fornavnet");
        String innEtternavn = showInputDialog("Skriv inn etternavnet");
        String innAdresse = showInputDialog("Skriv inn adresse");
        String innTelefonNr = showInputDialog("Skriv inn telefonnummeret");

        Person nyPerson = new Person(innFornavn, innEtternavn, innAdresse, innTelefonNr);
        nyPerson.skrivUt();
    }
}
