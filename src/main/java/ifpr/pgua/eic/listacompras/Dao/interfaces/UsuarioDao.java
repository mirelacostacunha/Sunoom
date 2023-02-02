package ifpr.pgua.eic.listacompras.Dao.interfaces;

import ifpr.pgua.eic.listacompras.entities.Usuario;
import ifpr.pgua.eic.listacompras.results.Result;

public interface UsuarioDao {
    Result criar (Usuario usuario);
    Result atualizar (int id, Usuario usuario);
    Usuario buscarPorUsuario(String nome);
}
