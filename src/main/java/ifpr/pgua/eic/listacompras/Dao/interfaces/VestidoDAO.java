package ifpr.pgua.eic.listacompras.Dao.interfaces;

import java.util.ArrayList;
import java.util.List;

import ifpr.pgua.eic.listacompras.entities.Itens;
import ifpr.pgua.eic.listacompras.results.Result;

public interface VestidoDAO {
   
    Itens buscarPorId(int id);
    List<Itens> listarTodos();
    void getList();
} 

