package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class SomarController implements Initializable {
    
    @FXML
    private Button btnLimpar;
    
    @FXML
    private Button btnSomar;
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
       try{
        Double numero1 = Double.valueOf(txtNumero1.getText());
        Double numero2 = Double.valueOf(txtNumero2.getText());
        Double soma = numero1 + numero2;
        lblSoma.setText(soma.toString());
       }catch(NumberFormatException e){
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
    
   
    

    
}
