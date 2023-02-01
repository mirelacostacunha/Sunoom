package ifpr.pgua.eic.listacompras.controllers;

import ifpr.pgua.eic.listacompras.App;
import ifpr.pgua.eic.listacompras.utils.BorderPaneRegion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaVestido {
    

    @FXML
    private Button btSair;

    @FXML
    private void sair() {
        App.changeScreenRegion("Principal", BorderPaneRegion.CENTER);
    }
}

