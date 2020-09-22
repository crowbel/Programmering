package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg7 {
    public static void main(String[]args){

        String innAntallPizza = showInputDialog("Skriv inn antall pizzaer: ");
        int antallPizza = 0;
        try{
            antallPizza = Integer.parseInt(innAntallPizza);
        }catch (NumberFormatException e){
            System.out.println("Antall må oppgis i tall.");
            return;
        }

        String innAntallPers = showInputDialog("Skriv inn antall personer som skal dele pizzaene: ");
        int antallPers = 0;
        try{
            antallPers = Integer.parseInt(innAntallPers);
        }catch (NumberFormatException e){
            System.out.println("Antall må oppgis i tall.");
            return;
        }

        String innAntallSlicesPerPizza = showInputDialog("Skriv inn hvor mange stykker hver pizza er delt inn i: ");
        int antallSlicesPerPizza = 0;
        try{
            antallSlicesPerPizza = Integer.parseInt(innAntallSlicesPerPizza);
        }catch (NumberFormatException e){
            System.out.println("Antall må oppgis i tall.");
        }

        double slicesPrPers = (antallPizza * antallSlicesPerPizza) / antallPers;

        double slicesRest = (antallPizza * antallSlicesPerPizza) % antallPers;

        showMessageDialog(null, "Dersom man er " + antallPers + " personer og har " + antallPizza + " pizzaer får hver person " +
                slicesPrPers + " slices og " + slicesRest + " blir til overs.");

    }
}
