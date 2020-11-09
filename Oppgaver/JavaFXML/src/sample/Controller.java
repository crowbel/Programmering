package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtAntallÅr;

    @FXML
    private TextField txtRente;

    @FXML
    private TextField txtBeløp;

    @FXML
    private Label lblResultat;

    @FXML
    void Beregn(ActionEvent event) {

        try{
            double beløp = Double.parseDouble(txtBeløp.getText());
            double rente = Double.parseDouble(txtRente.getText());
            int antallÅr = Integer.parseInt(txtAntallÅr.getText());
            double resultat = beløp * Math.pow(1 + (rente/100), antallÅr);
            lblResultat.setText("Totalbeløpet etter " + antallÅr + " år blir " + String.format("%.2f",resultat));

        }catch(Exception e){
            lblResultat.setText("Skriv inn tall i alle feltene!");
        }

    }

}
