package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg6 {
    public static void main(String[]args){

        String innDollar = showInputDialog("Skriv inn antall dollar: ");

        double dollar = 0;
        try{
            dollar = Double.parseDouble(innDollar);
        }catch (NumberFormatException e){
            showMessageDialog(null, "Data ikke gyldig, må være tall: " + innDollar);
            System.out.print(e);
            return;
        }

        double kurs = 8.97;
        double nok = dollar * kurs;

        showMessageDialog(null, dollar + " USD tilsvarer med dagens kurs " + nok + " NOK.");


    }
}
