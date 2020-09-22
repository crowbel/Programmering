package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg3 {
    public static void main(String[]args){


        String innLengde = showInputDialog("Skriv inn lengden på arealet");
        double lengde;
        try{
            lengde = Double.parseDouble(innLengde);
        }catch (Exception e){
            lengde = 0;
            System.out.println(e);
        }


        String innBredde = showInputDialog("Skriv inn bredde på arealet");
        double bredde;
        try{
            bredde = Double.parseDouble(innBredde);
        }catch (Exception e){
            bredde = 0;
            System.out.println(e);
        }

        double areal = bredde * lengde ;

        System.out.println("Et rektangel med bredde " + bredde + " cm og lengde " + lengde + " har et areal på " + areal + " cm^2.");

    }
}
