package ifpr.pgua.eic.listacompras.repository;

import java.util.ArrayList;
import java.util.List;

import ifpr.pgua.eic.listacompras.Dao.JDBCVestidoDAO;
import ifpr.pgua.eic.listacompras.Dao.interfaces.VestidoDAO;
import ifpr.pgua.eic.listacompras.entities.Itens;

public class ListaVestidoRepository {

   private List<Itens> item;
   private VestidoDAO dao;

   public ListaVestidoRepository(JDBCVestidoDAO vestidoDao) {
      this.dao = vestidoDao;
}


   public List<Itens> getItem(){
    return item;
}
    
 public void addVestidos(Itens itens){

    item.add(itens);

 }

public List<Itens> listarTodos() {
     return dao.listarTodos();
}
}
