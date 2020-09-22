package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg4 {
    public static void main(String[]args){

        String innRadius = showInputDialog("Skriv inn radiusen til sirkelen: ");
        double radius;
        try{
            radius = Double.parseDouble(innRadius);
        }catch (Exception e){
            radius = 0;
        }

        double omkrets = radius * 2 * Math.PI;

        String omkretsToDesimaler = String.format("%.2f", omkrets);

        showMessageDialog(null, "Omkretsen av en sirkel med " + radius + " cm som har radius blir " + omkretsToDesimaler + " cm.");

    }
}
