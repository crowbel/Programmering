package Variabler2Oppgaver;

import javax.swing.*;

public class Oppg4 {
    public static void main(String [] args){

        String inntall1 = JOptionPane.showInputDialog("Skriv inn et desimaltall: ");
        double tall1;
        try{
            tall1 = Double.parseDouble(inntall1);
            } catch (Exception e) {
            tall1 = 0;
            System.out.println(e);
        }

        String inntall2 = JOptionPane.showInputDialog("Skriv inn et desimaltall: ");
        double tall2;
        try{
            tall2 = Double.parseDouble(inntall2);
            } catch (Exception e) {
            tall2 = 0;
            System.out.println(e);
        }

        String inntall3 = JOptionPane.showInputDialog("Skriv inn et desimaltall: ");
        double tall3;
        try{
            tall3 = Double.parseDouble(inntall3);
            } catch (Exception e) {
            tall3 = 0;
            System.out.println(e);
        }

        double gjennomsnitt = (tall1 + tall2 + tall3) / 3;

        System.out.println("Gjennomsnittet av " + tall1 + " , " + tall2 + " , " + tall3 + " er: " + (gjennomsnitt));

    }
}
