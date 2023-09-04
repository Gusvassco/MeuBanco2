package Cliente;

public class Cliente extends Pessoa {
    private double rendaMensal;
    public Cliente(String nome, int idade, String nomeDaMae, int score, double rendaMensal) {
        super(nome, idade, nomeDaMae, score);
        this.rendaMensal = rendaMensal;

    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
}
