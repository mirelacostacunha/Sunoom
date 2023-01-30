package ifpr.pgua.eic.listacompras;

import ifpr.pgua.eic.listacompras.controllers.TelaCadastro;
import ifpr.pgua.eic.listacompras.controllers.TelaLogin;
import ifpr.pgua.eic.listacompras.controllers.TelaPrincipal;
import ifpr.pgua.eic.listacompras.repository.LoginRepository;
import ifpr.pgua.eic.listacompras.utils.BaseAppNavigator;
import ifpr.pgua.eic.listacompras.utils.ScreenRegistry;
import ifpr.pgua.eic.listacompras.utils.ScreenRegistryFXML;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;


public class App extends BaseAppNavigator {
    
    LoginRepository loginRepository;


    @Override
    public void init() throws Exception {
        super.init();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }



    @Override
    public String getHome() {
        return "Login";
    }

    @Override
    public String getAppTitle() {
        return "Sunoom's Boutiques";
    }

    @Override
    public void registrarTelas() {
       registraTela("Login", new ScreenRegistryFXML(getClass(), "login.fxml", (o)-> new TelaLogin()));
       registraTela("Cadastro", new ScreenRegistryFXML(getClass(), "cadastro.fxml", (o)-> new TelaCadastro(loginRepository)));
    }

}