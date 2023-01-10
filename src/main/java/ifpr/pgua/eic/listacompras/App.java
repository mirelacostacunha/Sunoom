package ifpr.pgua.eic.listacompras;

import ifpr.pgua.eic.listacompras.controllers.TelaCadastro;
import ifpr.pgua.eic.listacompras.controllers.TelaLogin;
import ifpr.pgua.eic.listacompras.controllers.TelaPrincipal;
import ifpr.pgua.eic.listacompras.utils.BaseAppNavigator;

import ifpr.pgua.eic.listacompras.utils.ScreenRegistryFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

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
        return "LOGIN";
    }

    @Override
    public String getAppTitle() {
        return "Lista de Compras";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class,"principal.fxml",o->new TelaPrincipal()));
        registraTela("LOGIN",new ScreenRegistryFXML(App.class, "login.fxml",o->new TelaLogin()));
        registraTela("CADASTRO", new ScreenRegistryFXML(App.class, "cadastro.fxml",o-> new TelaCadastro())) ;
            
        
    }


}