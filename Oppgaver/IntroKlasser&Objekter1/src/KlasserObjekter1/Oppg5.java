package KlasserObjekter1;

class Kalkulator{

    double innTall1;

    double innTall2;

    double sum;

    public double Addisjon(){
        sum = innTall1 + innTall2;
        return sum;
    }

    public void printAddisjon(){
        System.out.println(Addisjon());
    }

    public double Subtraksjon(){
        sum = innTall1 - innTall2;
        return sum;
    }

    public void printSubtraksjon(){
        System.out.println(Subtraksjon());
    }

    public double Multiplikasjon(){
        sum = innTall1 * innTall2;
        return sum;
    }

    public void printMultiplikasjon(){
        System.out.println(Multiplikasjon());
    }

    public double Divisjon(){
        sum = innTall1 / innTall2;
        return sum;
    }

    public void printDivisjon(){
        System.out.println(Divisjon());
    }

}

public class Oppg5 {
    public static void main(String[]args){

        Kalkulator newKalkulator = new Kalkulator();

        newKalkulator.innTall1 = 34.21;
        newKalkulator.innTall2 = 745.321;

        newKalkulator.Addisjon();
        newKalkulator.printAddisjon();

        newKalkulator.Subtraksjon();
        newKalkulator.printSubtraksjon();

        newKalkulator.Multiplikasjon();
        newKalkulator.printMultiplikasjon();

        newKalkulator.Divisjon();
        newKalkulator.printDivisjon();

    }
}
