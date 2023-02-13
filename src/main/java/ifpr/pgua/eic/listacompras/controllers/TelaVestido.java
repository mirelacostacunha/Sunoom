package ifpr.pgua.eic.listacompras.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import ifpr.pgua.eic.listacompras.entities.Itens;
import ifpr.pgua.eic.listacompras.repository.ListaVestidoRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaVestido implements Initializable {


    @FXML
    private TableView<Itens> tbItens;

    @FXML
    private TableColumn<Itens, String> tbcDescricao;

    @FXML
    private TableColumn<Itens, String> tbcItem;

    @FXML
    private TableColumn<Itens, String> tbcValor;

    ListaVestidoRepository repository;

   

    public  TelaVestido(ListaVestidoRepository repository){
        this.repository = repository;
    }   


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
      
       initTable();
    }


     private void initTable(){
        tbcItem.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tbcDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        tbcValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        Atualizar();

     }



    private void Atualizar(){
        tbItens.getItems().clear();
        tbItens.getItems().addAll(repository.listarTodos());
     }

            
        
     }
      


