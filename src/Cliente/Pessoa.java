package Cliente;

public class Pessoa {
    private String nome;
    private int idade;
    private String nomeDaMae;
    private int score;

    public Pessoa(String nome, int idade, String nomeDaMae, int score) {
        this.nome = nome;
        this.idade = idade;
        this.nomeDaMae = nomeDaMae;
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
