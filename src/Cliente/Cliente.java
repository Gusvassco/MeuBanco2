package Cliente;

import java.sql.SQLOutput;

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

    @Override
    public String toString() {
        return "========== Cliente ==========" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " +getIdade()+ "\n" +
                "Nome da mãe: " + getNomeDaMae() + "\n" +
                "Score: " + getScore() + "\n" +
                "Renda mensal: " + this.rendaMensal;
    }

}
