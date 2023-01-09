package ifpr.pgua.eic.listacompras;

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
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        return "Lista de Compras";
    }

    @Override
    public void registrarTelas() {
    
    }


}