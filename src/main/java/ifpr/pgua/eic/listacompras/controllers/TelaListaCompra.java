package ifpr.pgua.eic.listacompras.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.listacompras.App;
import ifpr.pgua.eic.listacompras.entities.Itens;
import ifpr.pgua.eic.listacompras.repository.ListaVestidoRepository;
import ifpr.pgua.eic.listacompras.utils.BorderPaneRegion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;


public class TelaListaCompra implements Initializable {

    private ListaVestidoRepository listaVestidoRepository;

    @FXML
    private Button btComprar;

    @FXML
    private Button btVoltar;

    @FXML
    private ListView<Itens> ltvVestido;

    @FXML
    private TextArea taDetalhes;

    @FXML
    void comprar(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {

        App.changeScreenRegion("Principal", BorderPaneRegion.CENTER);
    }

    public TelaListaCompra(ListaVestidoRepository listaVestidoRepository){
        this.listaVestidoRepository = listaVestidoRepository;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        ltvVestido.getItems().clear();;
        ltvVestido.getItems().addAll(listaVestidoRepository.getItem());
    }


   


}
