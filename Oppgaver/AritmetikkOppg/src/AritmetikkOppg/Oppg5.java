package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg5 {
    public static void main(String[]args){

        String innTempFahr = showInputDialog("Skriv inn grader i fahrenheit for konvertering: ");

        double fahr = 0;
        try{
        fahr = Double.parseDouble(innTempFahr);
        }catch (NumberFormatException e){
            System.out.print(e + "Gradene må oppgis i tall");
            return;
        }

        double celsius = (fahr - 32) / 1.8;

        showMessageDialog(null, fahr + " fahrenheit tilsvarer " + celsius + " grader celsius!" );

    }
}
