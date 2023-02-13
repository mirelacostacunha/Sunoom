package ifpr.pgua.eic.listacompras.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ifpr.pgua.eic.listacompras.Dao.interfaces.VestidoDAO;
import ifpr.pgua.eic.listacompras.entities.Itens;
import ifpr.pgua.eic.listacompras.results.FabricaConexao;
import ifpr.pgua.eic.listacompras.results.Result;

public class JDBCVestidoDAO implements VestidoDAO {

    private FabricaConexao fabricaConexao;
    private   List<Itens> i;

    public JDBCVestidoDAO(JDBCVestidoDAO vestidoDao) {
    }

    public void JDBCVestidoDAO(FabricaConexao fabricaConexao){
        this.fabricaConexao = fabricaConexao;
    }

    @Override
    public Itens buscarPorId(int id) {
        Itens is = null;
        try {
            Connection con = fabricaConexao.getConnection();

            PreparedStatement pstm = con.prepareStatement("SELECT * FROM Itens_tca where id=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()){
                int valor = rs.getInt("valor");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                is = new Itens(id, descricao, nome, valor );
            }
        


            rs.close();
            pstm.close();
            con.close();

            is = buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return is;
        
    }

    @Override
    public List<Itens> listarTodos() {
      try {
        
        Connection con = fabricaConexao.getConnection();
         PreparedStatement pstm = con.prepareStatement("SELECT * FROM Itens_tca");
         ResultSet resultSet = pstm.executeQuery();
        List<Itens> itens = new ArrayList<>();
        
         while(resultSet.next()){
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String descricao = resultSet.getString("descricao");
            int valor = resultSet.getInt("valor");
           
            Itens item = new Itens(id, nome, descricao, valor);

            i.add(item);
            
         }

         resultSet.close();
         pstm.close();
         con.close();
         return i;

        } catch (Exception e) {
          System.out.println(e.getMessage());
          return Collections.emptyList();
        }
    }

    @Override
    public void getList() {
        // TODO Auto-generated method stub
        
    }
}

