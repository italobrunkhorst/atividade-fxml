package base.exemplos.fxml.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastro {

    @FXML
    private TextField tfPlaca;

    @FXML
    private void cadastrar(ActionEvent event){
        String placa = tfPlaca.getText();

        System.out.println(placa);
    }
    
}
