package ifpr.pgua.eic.listacompras.repository;

import ifpr.pgua.eic.listacompras.Dao.interfaces.UsuarioDao;
import ifpr.pgua.eic.listacompras.entities.Usuario;
import ifpr.pgua.eic.listacompras.results.Result;

public class LoginRepository {
    
    private UsuarioDao dao;

    public LoginRepository(UsuarioDao dao){
        this.dao = dao;
    }
     
    public Result cadastrar(String nome, String senha ){

        Usuario usuario = new Usuario(nome, senha);

        return dao.criar(usuario);
    }

    public Result atualizar(int id, String nome, String senha){
        Usuario usario = new Usuario(id, nome, senha);
        return dao.atualizar(id, usario);
    }
}
