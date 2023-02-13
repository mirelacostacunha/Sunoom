package ifpr.pgua.eic.listacompras.entities;

public class Acessorio {
    
    private int id;
    private String nome;
    private String descricao;
    private String valor;

    public Acessorio(String nome, String descricao, int i) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Acessorio(Integer id, String nome, String descricao, String valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
