package ifpr.pgua.eic.listacompras.repository;

import java.util.ArrayList;
import java.util.List;


import ifpr.pgua.eic.listacompras.entities.Vestido;

public class ListaRepository {

   private ArrayList<Vestido>Vestidos;

   public ListaRepository(){
    Vestidos = new ArrayList<>();
   }

   public List<Vestido> getVestido(){
    return Vestidos;
}
    
}
