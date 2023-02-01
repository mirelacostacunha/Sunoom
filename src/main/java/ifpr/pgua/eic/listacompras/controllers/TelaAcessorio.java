package ifpr.pgua.eic.listacompras.controllers;

import ifpr.pgua.eic.listacompras.App;
import ifpr.pgua.eic.listacompras.utils.BorderPaneRegion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaAcessorio {
    

    @FXML
    private Button btVoltar;

    @FXML
    private void voltar() {
        App.changeScreenRegion("Principal", BorderPaneRegion.CENTER);

    } 

}
