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
    void acessorios(ActionEvent event){
        App.changeScreenRegion("Acessorios", BorderPaneRegion.CENTER);
    }

    
    
    @FXML
    void vestidos(ActionEvent event) {
    
        App.changeScreenRegion("Vestidos", BorderPaneRegion.CENTER);

    
    }
}
