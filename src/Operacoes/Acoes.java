package Operacoes;

public class Acoes {
    private double limiteCredito;
    private double juros;
    private double lucroCredito;
    private double emprestimo;
    private double lucroEmprestimo;

    public Acoes(double limiteCredito, double juros, double lucroCredito, double emprestimo, double lucroEmprestimo) {
        this.limiteCredito = limiteCredito;
        this.juros = juros;
        lucroCredito = (limiteCredito * juros )/100;
        this.lucroCredito = lucroCredito;
        this.emprestimo = emprestimo;
        lucroEmprestimo = (emprestimo * juros)/100;
        this.lucroEmprestimo = lucroEmprestimo;


    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getLucroCredito() {
        return lucroCredito;
    }

    public void setLucroCredito(double lucroCredito) {
        this.lucroCredito = lucroCredito;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getLucroEmprestimo() {
        return lucroEmprestimo;
    }

    public void setLucroEmprestimo(double lucroEmprestimo) {
        this.lucroEmprestimo = lucroEmprestimo;
    }

}
