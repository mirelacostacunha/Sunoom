package ifpr.pgua.eic.listacompras;

import ifpr.pgua.eic.listacompras.controllers.TelaCadastro;
import ifpr.pgua.eic.listacompras.controllers.TelaLogin;
import ifpr.pgua.eic.listacompras.controllers.TelaPrincipal;
import ifpr.pgua.eic.listacompras.utils.BaseAppNavigator;

import ifpr.pgua.eic.listacompras.utils.ScreenRegistryFXML;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(loadTela("fxml/login.fxml",o-> new TelaLogin()));
        stage.setScene(scene);
        stage.show();
    }

    public static Parent loadTela(String fxml, Callback conttroller){
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource(fxml));
            loader.setControllerFactory(conttroller);
            root = loader.load();
            
        } catch (Exception e) {
            System.out.println("Problema ao carregar o FXML!!");
            e.printStackTrace();
            System.exit(0);
        }

        return root;
    }

    public static void main(String[] args) {
        launch();
    }
}