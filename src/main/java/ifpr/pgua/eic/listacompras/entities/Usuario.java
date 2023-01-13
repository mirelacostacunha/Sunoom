package ifpr.pgua.eic.listacompras.entities;

public class Usuario {
    
    private int id;
    private String nome;
    private String senha;
   
    public Usuario(String nome, String senha) {
        this(-1,nome, senha);
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome= nome;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return nome;
    }

    public void setUsuario(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
