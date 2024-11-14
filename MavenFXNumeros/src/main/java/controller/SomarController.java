package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class SomarController {
    
    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSomar;
    @FXML
    private Button btnFechar;

    @FXML
    private Label lblNumero1;

    @FXML
    private Label lblNumero2;

    @FXML
    private Label lblResultado;

    @FXML
    private Label lblSoma;

    @FXML
    private GridPane gridBotoes;

    @FXML
    private GridPane gridPrincipal;

    @FXML
    private AnchorPane painelPrincipal;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    void onClickBtnSomar(ActionEvent event) {
        try {
            Double numero1 = Double.valueOf(txtNumero1.getText());
            Double numero2 = Double.valueOf(txtNumero2.getText());
            Double soma = numero1 + numero2;
            lblSoma.setText(soma.toString());
        } catch (NumberFormatException e) {
            System.out.println("Número inválido!");
        }
    }

    @FXML
    void onClickBtnLimpar(ActionEvent event) {
        txtNumero1.setText("");
        txtNumero2.setText("");
        lblSoma.setText("");
        txtNumero1.requestFocus();
    }

    @FXML
    void onClickBtnFechar(ActionEvent event) {
            System.exit(0);
    }


}
