package Oblig1;

class Sirkel{

    //statisk metode som beregner og returnerer sirkelens diameter.
    static double diameterUtregning(double radius){
        double diameter = radius * 2;
        return diameter;
    }

    //Statisk metode som beregner og returnerer sirkelens omkrets.
    static double omkretsUtregning(double radius){
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
        //Omkrets = 2*pi*r
    }

    //Statisk metode som beregner og utregner sirkelens areal.
    static double arealUtregning(double radius){
        double areal = Math.pow(Math.PI*radius,2);
        return areal;
        //Areal = pi*r^2
        //Math.pi kan brukes som en konstant for PI
        //Math.pow kan brukes for å opphøye et tall i potens
    }
}

public class Oppg1 {
    public static void main(String[] args) {

        //Sett en variabel lik verdien for radius
        double radius = 23.5;

        /*Kall så de statiske metodene i sirkel-klassen for å vise følgende:
        System.out (gitt ved radius 23.5)
         */
        double utAreal = Sirkel.arealUtregning(radius);
        String arealToDesimaler = String.format("%.2f", utAreal);
        System.out.println("Arealet av sirkelen med radius " + radius + " er " + arealToDesimaler);

        double utOmkrets = Sirkel.omkretsUtregning(radius);
        String omkretsToDesimaler = String.format("%.2f",utOmkrets);
        System.out.println("Omkretsen av sirkelen med radius " + radius + " er " + omkretsToDesimaler);

        System.out.println("Diameteren av sirkelen med radius " + radius + " er " + Sirkel.diameterUtregning(radius));


        //Arealet av sirkelen med radius 23.5 er 1734,94
        //Omkretsen av sirkelen med radius 23.5 er 147,65
        //Diameteren til sirkelen med radius 23.5 er 47,00


        // Tips : String.format("%.2f, desimalverdi); for å formatere to desimaler
    }
}
