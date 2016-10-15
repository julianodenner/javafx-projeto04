package com.jdenner.controller;

import com.jdenner.model.Calculo;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class FormularioController implements Initializable {

    @FXML
    private TextField tfNumero1;

    @FXML
    private TextField tfNumero2;

    @FXML
    public void calcular(ActionEvent event) throws IOException {
        Calculo calculo = new Calculo();
        try {
            calculo.setNumero1(tfNumero1.getText());
            calculo.setNumero2(tfNumero2.getText());
        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setHeaderText("Número inválido");
            a.show();
            return;
        }
        
        String url = "/com/jdenner/view/Resultado.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        Parent root = loader.load();
        
        ResultadoController controller = loader.getController();
        controller.setCalculo(calculo);
        
        Scene scene = new Scene(root);
        Stage stage = (Stage) tfNumero1.getScene().getWindow();
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
    
}
