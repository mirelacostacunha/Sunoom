package ifpr.pgua.eic.listacompras.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.google.protobuf.ValueOrBuilder;

import ifpr.pgua.eic.listacompras.App;
import ifpr.pgua.eic.listacompras.entities.Vestido;
import ifpr.pgua.eic.listacompras.repository.ListaRepository;
import ifpr.pgua.eic.listacompras.utils.BorderPaneRegion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class TelaListaCompra implements Initializable {


    @FXML
    private ListView<Vestido> ltvVestido;

    @FXML
    private TextArea taDetalhes;

    private ListaRepository listaRepository;

    public TelaListaCompra(ListaRepository listaRepository){
        this.listaRepository = listaRepository;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
       ltvVestido.getItems().clear();
       ltvVestido.getItems().addAll(listaRepository.getVestido());
        
    }

    @FXML
    private void mostraDetalhes(MouseEvent evento){
        taDetalhes.clear();
    
        Vestido vestido = ltvVestido.getSelectionModel().getSelectedItem();
    
        if(vestido != null){
            taDetalhes.appendText("Nome:"+vestido.getNome()+"\n");
            taDetalhes.appendText("Descriçao:"+vestido.getDescricao()+"\n");
            taDetalhes.appendText("Valor:"+vestido.getValor()+"\n");

        }


   // @FXML
   // private void voltar(ActionEvent event){
   //     App.changeScreenRegion("Principal", BorderPaneRegion.CENTER);
   // }
    
    
    
    }


}
