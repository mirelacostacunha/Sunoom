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
    
    private static Stage stage;

    private static Scene login;
    private static Scene cadastro;
    private static Scene principal;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("login.fxml"));
        login = new Scene(fxmlLogin, 640, 420);

        Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
        cadastro = new Scene(fxmlCadastro, 640, 420);

        Parent fxmlPrincipal = FXMLLoader.load(getClass().getResource("principal.fxml"));
        principal = new Scene(fxmlPrincipal, 640, 420);
        
        
        primaryStage.setScene(login);
        primaryStage.show();
    }

    public static void mudarTela(String scr){
        switch(scr){
            
            case "login":
                stage.setScene(login);
            break;

            case "cadastro":
                stage.setScene(cadastro);
            break;

            case "principal":
                stage.setScene(principal);
            break;
        }
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