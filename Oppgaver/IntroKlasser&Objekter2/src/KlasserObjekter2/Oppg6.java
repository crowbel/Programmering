package KlasserObjekter2;

import static javax.swing.JOptionPane.*;

class Vind{

    private double vindHastighet = 0.0;

    //Her skal det inn en konstruktør for å sette vindhastigheten
    public Vind(double vindHastighet){
        this.vindHastighet = vindHastighet;
    }

    public double getVindHastighet(){ return vindHastighet; }

    public boolean erOrkan(){
        return vindHastighet > 120;
    }

    public boolean erVindstille(){
        return vindHastighet < 2;
    }

    public double getKnop(){
        return vindHastighet / 1852;
    }

    public int getBeaufort(){
        int ut = (int) (Math.pow(vindHastighet / 3.01, 0.6666)+0.5);
        if(ut > 12){
            ut = 12;
        }
        return ut;
    }

}

public class Oppg6 {
    public static void main(String[] args) {

        String innVindHastighet = showInputDialog("Skriv inn vindhastigheten: ");
        double vind = Double.parseDouble(innVindHastighet);
        Vind vindtest1 = new Vind(vind);

        String ut = "Vindhastigheten er: " + vindtest1.getVindHastighet() + "\n";
        if(vindtest1.erOrkan()){
            ut += "Det er orkan!\n";
        }
        if(vindtest1.erVindstille()){
            ut += "Det er stille\n";
        }
        String knop = String.format("%.2f", vindtest1.getKnop());
        ut += "Det er " + knop + " knop\n";
        ut += "Og det tilsvarer " + vindtest1.getBeaufort() + " på beaufort skalaen!";
        showMessageDialog(null, ut);


    }
}
