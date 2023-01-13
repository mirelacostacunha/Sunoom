package ifpr.pgua.eic.listacompras.controllers;

import ifpr.pgua.eic.listacompras.App;
import ifpr.pgua.eic.listacompras.entities.Usuario;
import ifpr.pgua.eic.listacompras.repository.LoginRepository;
import ifpr.pgua.eic.listacompras.results.Result;
import ifpr.pgua.eic.listacompras.utils.BorderPaneRegion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
    
    private LoginRepository repository;

    private boolean atualizar = false;

    private Usuario selecionado = null;
    
    public TelaCadastro(LoginRepository repository){
        this.repository = repository;
    }

    public void initialize(){

    }

    @FXML
    void sair(ActionEvent event) {
        App.changeScreenRegion("Login", BorderPaneRegion.CENTER);
    }

    @FXML
    void cadastrar(ActionEvent event) {
        
        String msg = null;
        String nome = tfUsuario.getText();
        String senha = tfSenha.getText();

        Result result = null;

        if (atualizar) {
            result = repository.atualizar(selecionado.getId(), nome, senha);
        msg = "concluido";
        } else {
            result = repository.cadastrar(nome, senha);
            msg = "problemas";
        }


        Alert alert = new Alert(AlertType.INFORMATION, msg);
        alert.showAndWait();
    }

}
