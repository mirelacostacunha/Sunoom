package ifpr.pgua.eic.listacompras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ifpr.pgua.eic.listacompras.Dao.interfaces.ListaCompraDAO;
import ifpr.pgua.eic.listacompras.Dao.interfaces.ListaVestido;
import ifpr.pgua.eic.listacompras.Dao.interfaces.VestidoDAO;
import ifpr.pgua.eic.listacompras.entities.Itens;
import ifpr.pgua.eic.listacompras.entities.ListaCompra;
import ifpr.pgua.eic.listacompras.results.FabricaConexao;
import ifpr.pgua.eic.listacompras.results.Result;

public class JDBCListaCompraDAO<Vestidos> implements ListaCompraDAO {

    @Override
    public Result listar() {
        // TODO Auto-generated method stub
        return null;
    }
 

 
}