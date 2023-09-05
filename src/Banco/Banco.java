package Banco;


public class Banco {
    private String nome;
    private Num codigo;

    public Banco(String nome, Num codigo) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Num getCodigo() {
        return codigo;
    }

    public void setCodigo(Num codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }
}
