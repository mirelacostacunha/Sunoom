package ifpr.pgua.eic.listacompras.entities;

public class Itens {
    
    private int id;
    private String nome;
    private String descricao;
    private String  valor;

    public Itens(String nome, String descricao, String valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    public Itens(int id, String nome, String descricao, int valor2) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
}
