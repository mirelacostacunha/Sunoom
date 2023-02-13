package ifpr.pgua.eic.listacompras;

import ifpr.pgua.eic.listacompras.Dao.JDBCUsuarioDAO;
import ifpr.pgua.eic.listacompras.Dao.JDBCVestidoDAO;
import ifpr.pgua.eic.listacompras.Dao.interfaces.UsuarioDao;
import ifpr.pgua.eic.listacompras.controllers.TelaAcessorio;
import ifpr.pgua.eic.listacompras.controllers.TelaCadastro;
import ifpr.pgua.eic.listacompras.controllers.TelaListaCompra;
import ifpr.pgua.eic.listacompras.controllers.TelaLogin;
import ifpr.pgua.eic.listacompras.controllers.TelaPrincipal;
import ifpr.pgua.eic.listacompras.controllers.TelaVestido;
import ifpr.pgua.eic.listacompras.repository.ListaVestidoRepository;
import ifpr.pgua.eic.listacompras.repository.LoginRepository;
import ifpr.pgua.eic.listacompras.results.FabricaConexao;
import ifpr.pgua.eic.listacompras.utils.BaseAppNavigator;
import ifpr.pgua.eic.listacompras.utils.ScreenRegistryFXML;



public class App extends BaseAppNavigator {
    
    ListaVestidoRepository ListaVestidoRepository = null;
    FabricaConexao fabricaConexao;
    UsuarioDao usuarioDao;
    LoginRepository loginRepository;
    ListaVestidoRepository listaVestidoRepository;
    JDBCVestidoDAO vestidoDao;


    @Override
    public void init() throws Exception {
        super.init();
        fabricaConexao = FabricaConexao.getInstance();
        usuarioDao = new JDBCUsuarioDAO(fabricaConexao);
        loginRepository = new LoginRepository(usuarioDao);
        vestidoDao = new JDBCVestidoDAO(vestidoDao);
        listaVestidoRepository = new ListaVestidoRepository(vestidoDao);

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
       registraTela("Principal", new ScreenRegistryFXML(getClass(), "principal.fxml", (o)-> new TelaPrincipal()));
       registraTela("Login", new ScreenRegistryFXML(getClass(), "login.fxml", (o)-> new TelaLogin()));
       registraTela("Cadastro", new ScreenRegistryFXML(getClass(), "cadastro.fxml", (o)-> new TelaCadastro(loginRepository)));
       registraTela("Vestidos", new ScreenRegistryFXML(getClass(), "vestidos_2.fxml", (o)-> new TelaVestido(ListaVestidoRepository)));
       registraTela("Acessorios", new ScreenRegistryFXML(getClass(), "acessorio.fxml", (o)-> new TelaAcessorio()));
       registraTela("ListaCompra", new ScreenRegistryFXML(getClass(), "listaCompra.fxml", (o)-> new TelaListaCompra(ListaVestidoRepository)));
    }

}