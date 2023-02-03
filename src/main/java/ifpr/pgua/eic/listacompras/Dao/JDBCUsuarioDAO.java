package ifpr.pgua.eic.listacompras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ifpr.pgua.eic.listacompras.Dao.interfaces.UsuarioDao;
import ifpr.pgua.eic.listacompras.entities.Usuario;
import ifpr.pgua.eic.listacompras.results.FabricaConexao;
import ifpr.pgua.eic.listacompras.results.Result;

public class JDBCUsuarioDAO implements UsuarioDao{

    private FabricaConexao fabricaConexao;

    public JDBCUsuarioDAO(FabricaConexao fabricaConexao){
        this.fabricaConexao = fabricaConexao;
    }

    @Override
    public Result criar(Usuario usuario) {
       
        try {
            
            Connection con = fabricaConexao.getConnection();

            String sql = "INSERT INTO cadastro_tca(usuario,senha) VALUES (?,?)";
        
        PreparedStatement pstm = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

            
            pstm.setString(1, usuario.getUsuario());
            pstm.setString(2, usuario.getSenha());
       
            pstm.execute();

            pstm.close();
            con.close();

            return Result.sucess("Cliente criado com sucesso!");
        } catch (SQLException resultado) {
            System.out.println(resultado.getMessage());
            return Result.fail(resultado.getMessage());
        }
    }

    @Override
    public Usuario buscarPorUsuario(String nome) {
          Usuario usuario = null;
       
        try {
            Connection con = fabricaConexao.getConnection();

            PreparedStatement pstm = con.prepareStatement("SELECT *  FROM cadastro_tca WHERE usuario=?");
            pstm.setString(1, nome);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()){
                String senha = rs.getString("senha");
                usuario = new Usuario( nome, senha);
            }

            rs.close();
            pstm.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
            return null;
           
        }
        return usuario;
    }

    @Override
    public Result atualizar(int id, Usuario usuario) {
        try {
            
            Connection con = fabricaConexao.getConnection();

            PreparedStatement pstm = con.prepareStatement("INSERT INTO usuario_tca(usuario,senha) VALUES (?,?)");

            pstm.setInt(1, usuario.getId());
            pstm.setString(1, usuario.getUsuario());
            pstm.setString(2, usuario.getSenha());
       
            pstm.executeUpdate();

            pstm.close();
            con.close();

            return Result.sucess("Seja bem vindo, cadastro realizado com sucesso!");
        } catch (SQLException resultado) {
            System.out.println(resultado.getMessage());
            return Result.fail(resultado.getMessage());
        }
    }

    
    
}