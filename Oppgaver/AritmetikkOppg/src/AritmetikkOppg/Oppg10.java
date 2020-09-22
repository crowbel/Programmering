package AritmetikkOppg;

import static javax.swing.JOptionPane.*;

public class Oppg10 {
    public static void main(String[]args){

        String innAlder = showInputDialog("Skriv inn alderen din: ");
        int alder = 0;
        try{
            alder = Integer.parseInt(innAlder);
        }catch (NumberFormatException e){
            System.out.println(e + " Alder må defineres med et tall større en 0.");
            if (alder <= 0){
                showMessageDialog(null,"Alder må være større en 0");
            }
        }


        if (alder >= 18){
            System.out.println("Du er " + alder + " og er da gammel nok til å ta førerkort for bil.");
        }

        if(alder < 18){
            System.out.println("Du er bare " + alder + " og er derfor ikke gammel nok til å ta førerkort for bil." + "\n"
                    + " Men det er jo bare " + (18 - alder) + " år igjen til du kan ta den!");
        }
    }
}
