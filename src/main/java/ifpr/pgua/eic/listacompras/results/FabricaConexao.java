package ifpr.pgua.eic.listacompras.results;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ifpr.pgua.eic.listacompras.utils.Env;

public class FabricaConexao {
    private static final int MAX_CONEXOES = 5;

    private static FabricaConexao instance;

    private Connection[] conexoes;

    private FabricaConexao() {
        conexoes = new Connection[MAX_CONEXOES];
    }

    public static FabricaConexao getInstance() {
        if (instance == null) {
            instance = new FabricaConexao();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {

        String user = Env.get("DB_USER");
        String password = Env.get("DB_PASSWORD");
        String url = Env.get("DB_URL");

        for (int i = 0; i < conexoes.length; i++) {
            if (conexoes[i] == null || conexoes[i].isClosed()) {
                conexoes[i] = DriverManager.getConnection(url,
                        user,
                        password);
                return conexoes[i];
            }
        }
        throw new SQLException("Não há conexões disponíveis! Esqueceu de fechar?");
    }
}
