package ifpr.pgua.eic.listacompras.controllers;

import ifpr.pgua.eic.listacompras.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaPrincipal {


    @FXML
    private Button btProdutos;

    @FXML
    private Button btListas;

    @FXML
    private Button btNovaLista;

    @FXML
    private Button btSair;
    

    @FXML
    void sair(ActionEvent event) {
        App.mudarTela("login");
    }
}
