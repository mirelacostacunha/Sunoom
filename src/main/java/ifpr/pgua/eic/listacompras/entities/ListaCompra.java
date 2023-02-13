package ifpr.pgua.eic.listacompras.entities;

import java.util.List;

public class ListaCompra {
    
    private Integer id;
    private String descricao;
    private Double valor;
    private List<Itens> item;
    public ListaCompra(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public ListaCompra(Integer id, String descricao, Double valor,
            List<Itens> item) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.item = item;
    }
    public ListaCompra(Integer id, String descricao, Double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public ListaCompra(int id2, String nome, String descricao2, int valor2) {
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

    public void add(ListaCompra lista) {
    }
    public List<Itens> getItem() {
        return item;
    }
    public void setItem(List<Itens> item) {
        this.item = item;
    }
}
