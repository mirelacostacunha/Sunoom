package ifpr.pgua.eic.listacompras.controllers;

import ifpr.pgua.eic.listacompras.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaCadastro {
    
    @FXML
    private Button brEntar;

    @FXML
    private Button btCadastrar;

    @FXML
    private TextField tfSenha;

    @FXML
    private TextField tfSenha2;

    @FXML
    private TextField tfUsuario;


    @FXML
    void sair(ActionEvent event) {
        App.mudarTela("login");
    }

}
