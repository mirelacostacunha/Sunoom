package ifpr.pgua.eic.listacompras.controllers;

import java.io.IOException;

import ifpr.pgua.eic.listacompras.App;
import ifpr.pgua.eic.listacompras.repository.LoginRepository;
import ifpr.pgua.eic.listacompras.results.Result;
import ifpr.pgua.eic.listacompras.utils.BorderPaneRegion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class TelaLogin {

    LoginRepository login;
    
    @FXML
    private AnchorPane root;
   
    @FXML
    private Button btCadastrar;

    @FXML
    private Button btEntrar;

    @FXML
    private TextField tfSenha;

    @FXML
    private TextField tfUsuario;


    @FXML
    private void cadastrar(){
        App.changeScreenRegion("Cadastro", BorderPaneRegion.CENTER);
    }

    

    
    @FXML
    private void entrar() {
    
            
            App.changeScreenRegion("Principal", BorderPaneRegion.CENTER);
    
            }    
            }
