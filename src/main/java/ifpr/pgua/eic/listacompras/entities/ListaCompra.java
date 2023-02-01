package ifpr.pgua.eic.listacompras.entities;

import java.util.List;

public class ListaCompra {
    
    private Integer id;
    private String descricao;
    private Double valor;
    private List<ItemLista> vestidos, acessorios;
    public ListaCompra(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public ListaCompra(Integer id, String descricao, Double valor, List<ItemLista> vestidos,
            List<ItemLista> acessorios) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.vestidos = vestidos;
        this.acessorios = acessorios;
    }
    public ListaCompra(Integer id, String descricao, Double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public List<ItemLista> getVestidos() {
        return vestidos;
    }
    public void setVestidos(List<ItemLista> vestidos) {
        this.vestidos = vestidos;
    }
    public List<ItemLista> getAcessorios() {
        return acessorios;
    }
    public void setAcessorios(List<ItemLista> acessorios) {
        this.acessorios = acessorios;
    }
}
