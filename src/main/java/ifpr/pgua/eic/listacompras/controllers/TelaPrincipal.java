package ifpr.pgua.eic.listacompras.controllers;


import ifpr.pgua.eic.listacompras.App;
import ifpr.pgua.eic.listacompras.utils.BorderPaneRegion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaPrincipal {


    @FXML
    private Button btVestidos;

    @FXML
    private Button btAcessorios;

    @FXML
    private Button btSair;
    

    @FXML
    private void vestidos() {
        App.changeScreenRegion("Vestido", BorderPaneRegion.CENTER);

    } 

    @FXML
    private void acessorios() {
        App.changeScreenRegion("Acessorio", BorderPaneRegion.CENTER);

    } 

    @FXML
    private void sair() {
        App.changeScreenRegion("Login", BorderPaneRegion.CENTER);
    }
    
}
