package KlasserObjekter1;


class Bok{

    public String tittel;

    public void printTittel(){
        System.out.println("Tittelen på boka er " + tittel);
    }

    public double pris;

    public void printPris(){
        System.out.println("Prisen på boka er " + pris);
    }

    public String forfatter;

    public void printForfatter(){
        System.out.println("Forfatteren av boka er " + forfatter);
    }

    public int iSBN;

    public void printISBN(){
        System.out.println("iSBN-nummeret til boka er " + iSBN);
    }

}

public class Oppg1 {
    public static void main(String[]args){
        Bok nyBok = new Bok();
        nyBok.tittel = "Dødens Dal";
        nyBok.pris = 230.50 ;
        nyBok.forfatter = "Henrik Ibsen";
        nyBok.iSBN = 23232323;

        nyBok.printTittel();
        nyBok.printPris();
        nyBok.printForfatter();
        nyBok.printISBN();
    }
}
