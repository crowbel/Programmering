package KlasserObjekter2;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Oppg3 {

    static class Bensinkjøp{

        private String BensinstasjonLokasjon;
        private String BensinType;
        private double LiterFylt;
        private double PrisPrLiter;
        private String TidspunktFylling;

        public Bensinkjøp(String BensinstasjonLokasjon, String BensinType, double LiterFylt, double PrisPrLiter, String TidspunktFylling){
            this.BensinstasjonLokasjon = BensinstasjonLokasjon;
            this.BensinType = BensinType;
            this.LiterFylt = LiterFylt;
            this.PrisPrLiter = PrisPrLiter;
            this.TidspunktFylling = TidspunktFylling;
        }

        public String getBensinstasjonLokasjon(){
            return BensinstasjonLokasjon;
        }

        public void setBensinstasjonLokasjon(String BensinstasjonLokasjon){
            this.BensinstasjonLokasjon = BensinstasjonLokasjon;
        }

        public String getBensinType(){
            return BensinType;
        }

        public void setBensinType(String Bensintype){
            this.BensinType = Bensintype;
        }

        public double getLiterFylt(){
            return LiterFylt;
        }

        public void setLiterFylt(){
            this.LiterFylt = LiterFylt;
        }

        public double getPrisPrLiter(){
            return PrisPrLiter;
        }

        public void setPrisPrLiter(){
            this.PrisPrLiter = PrisPrLiter;
        }

        public String getTidspunktFylling(){
            return TidspunktFylling;
        }

        public void setTidspunktFylling(){
            this.TidspunktFylling = TidspunktFylling;
        }

        public double finnTotalPrisen(){
            return LiterFylt * PrisPrLiter;
        }
    }

    public static void main(String[] args) {

        String innBensinstasjonLokasjon = showInputDialog("Skriv inn lokasjonen: ");
        String innBensinType = showInputDialog("Skriv inn bensintype: ");
        double innLiterFylt = parseDouble(showInputDialog("Skriv inn antall liter fylt: "));
        double innPrisPrLiter = parseDouble(showInputDialog("Skriv inn pris pr liter: "));
        String innTidspunktFylling = showInputDialog("Skriv inn tidspunktet du fylte: ");

        Bensinkjøp nyBensinkjøp = new Bensinkjøp(innBensinstasjonLokasjon,innBensinType,innLiterFylt,innPrisPrLiter,innTidspunktFylling);

        double utPris = nyBensinkjøp.finnTotalPrisen();
        String prisToDesimaler = String.format("%.2f",utPris);
        String ut = innTidspunktFylling + " på " + innBensinstasjonLokasjon + " ble det fylt " + innLiterFylt + " til pris " + innPrisPrLiter + " per liter for "
        + innBensinType + " dette kostet da: " + prisToDesimaler;
        showMessageDialog(null,ut);
    }
}
