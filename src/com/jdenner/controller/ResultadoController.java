package com.jdenner.controller;

import com.jdenner.model.Calculo;
import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class ResultadoController implements Initializable {

    @FXML
    private Label lbResultado;

    @FXML
    public void voltar(ActionEvent event) throws IOException {
        String url = "/com/jdenner/view/Formulario.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) lbResultado.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setCalculo(Calculo calculo) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        
        String resultado = "";
        resultado += nf.format(calculo.getNumero1());
        resultado += " + ";
        resultado += nf.format(calculo.getNumero2());
        resultado += " = ";
        resultado += nf.format(calculo.getResultado());
        
        lbResultado.setText(resultado);                
    }
    
}
