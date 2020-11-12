package motorvogn;

interface Kjøretøy{
    public String toString();
}

class Bil implements Kjøretøy {

    String typeBetegnelse;
    Dato førstegangsReistrert;
    String kjenneTegn;
    int lastekapasitet;


    public Bil(String typeBetegnelse, Dato førstegangsReistrert, String kjenneTegn, int lastekapasitet) {
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsReistrert = førstegangsReistrert;
        this.kjenneTegn = kjenneTegn;
        this.lastekapasitet = lastekapasitet;
    }

    public String toString() {

        String ut = "Bilmerke: " + typeBetegnelse + "\n"
                + "Førstegangsregistrert: " + førstegangsReistrert + "\n"
                + "Skiltnummer: " + kjenneTegn + "\n"
                + "Lastekapasistet: " + lastekapasitet;

        return ut;
    }
}

class Motorsykkel implements Kjøretøy{


    String typeBetegnelse;
    Dato førstegangsReistrert;
    String kjenneTegn;


    public Motorsykkel(String typeBetegnelse, Dato førstegangsReistrert, String kjenneTegn){
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsReistrert = førstegangsReistrert;
        this.kjenneTegn = kjenneTegn;
    }

    public String toString(){

        String ut = "Bilmerke: " + typeBetegnelse + "\n"
                + "Førstegangsregistrert: " + førstegangsReistrert + "\n"
                + "Skiltnummer: " + kjenneTegn;

        return ut;
    }
}


