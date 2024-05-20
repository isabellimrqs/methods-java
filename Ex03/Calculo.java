package Ex03;

public class Calculo {

    double percentualAcrescimo = 0.35;
    int parcelasEmprestimo = 24;

    public double calcularValorTotalJuros(double quantidadeEmprestimo) {
        return quantidadeEmprestimo * percentualAcrescimo;
    }

    public double calcularValorTotalEmprestimo(double quantidadeEmprestimo, double totalJuros) {
        return quantidadeEmprestimo + totalJuros;
    }

    public double calcularValorParcela(double valorTotalEmprestimo) {
        return valorTotalEmprestimo / parcelasEmprestimo;
    }
}
