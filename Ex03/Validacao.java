package Ex03;

public class Validacao {

    double quantidadeEmprestimo;

    public Validacao(double quantidadeEmprestimo){
        this.quantidadeEmprestimo = quantidadeEmprestimo;
    }

    public boolean validaQuantidade(double quantidadeEmprestimo){
        return quantidadeEmprestimo <= 200000;
    }
}
