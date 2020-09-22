package Oblig1;

import static javax.swing.JOptionPane.*;

class Vare{

    private String navn;
    private int antall;
    private double pris;

    //Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris){
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    // Get/Set Metoder - antall og pris må være større en null:
    public String getNavn(){ return navn; }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public int getAntall(){ return antall; }

    public void setAntall(int antall){
        if(antall > 0){
            this.antall = antall;
        }
    }

    public double getPris(){ return pris; }

    public void setPris(double pris){
        if(pris > 0){
            this.pris = pris;
        }
    }

    //Metode for å beregne totalpris (pris * antall)
    public double totalPris(){
        return pris * antall;
    }
}

public class Oppg2 {
    public static void main(String[] args) {

        String vare1Navn = showInputDialog("Skriv inn navnet på varen: ");
        String innVare1Antall = showInputDialog("Skriv inn antall: ");
        String innVare1Pris = showInputDialog("Skriv inn prisen på varen: ");

        String vare2Navn = showInputDialog("Skriv inn navnet på varen: ");
        String innVare2Antall = showInputDialog("Skriv inn antall: ");
        String innVare2Pris = showInputDialog("Skriv inn prisen på varne: ");


        int vare1Antall, vare2Antall;
        double vare1Pris, vare2Pris;

        try{
            vare1Antall = Integer.parseInt(innVare1Antall);
            vare1Pris = Double.parseDouble(innVare1Pris);
        }catch (Exception e ){
            vare1Antall = 0;
            vare1Pris = 0;
            showMessageDialog(null,"Feil i antall eller pris");
        }
        try{
            vare2Antall = Integer.parseInt(innVare2Antall);
            vare2Pris = Integer.parseInt(innVare2Pris);
        }catch (Exception e ){
           vare2Antall = 0;
           vare2Pris = 0;
           showMessageDialog(null, "Feil i antall eller pris");
        }

        Vare vare1 = new Vare(vare1Navn,vare1Antall,vare1Pris);
        Vare vare2 = new Vare(vare2Navn,vare2Antall,vare2Pris);

        double sum = vare1.totalPris() + vare2.totalPris();

        System.out.println("Totalprisen ble: " + sum);

    }
}
