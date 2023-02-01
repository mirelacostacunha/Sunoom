package ifpr.pgua.eic.listacompras.entities;

public class ItemLista {

    private Integer id;
    private Vestido vestido;
    private Acessorio acessorio;
    private String descricao;
    private Double valor;
    
    public ItemLista(Integer id, Vestido vestido, Acessorio acessorio, String descricao, Double valor) {
        this.id = id;
        this.vestido = vestido;
        this.acessorio = acessorio;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vestido getVestido() {
        return vestido;
    }

    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
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
}
