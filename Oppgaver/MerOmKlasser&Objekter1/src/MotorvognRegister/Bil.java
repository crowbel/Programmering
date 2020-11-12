package MotorvognRegister;

public class Bil {

    //Opprett følgende attributter

    //typebetegnelse f.eks Audi A6
    public String typeBetegnelse;
    //førstegansregistrert av type Dato
    public Dato førstegangsRegistrert;
    //kjennetegn dvs. skiltnummer
    public String kjennetegn;


    //lag også konstruktør for alle attributtene
    public Bil(String typeBetegnelse, Dato førstegangsRegistrert, String kjennetegn) {
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistrert = førstegangsRegistrert;
        this.kjennetegn = kjennetegn;
    }


    //lag så en toString() for å vise alle attributtene
    public String toString(){
        String ut = "Bilmerke: " + typeBetegnelse + "\n"
                + "Førstegangsregistrert: " + førstegangsRegistrert + "\n"
                + "Registreringsnummer: " + kjennetegn;

        return ut;
    }


}
