package Ex03;

public class Calculo {

    double percentualAcrescimo = 0.35;
    int parcelasEmprestimo = 24;
    double percentualSalario = 0.15;

    public double calcularValorTotalJuros(double quantidadeEmprestimo) {
        System.out.print("O valor total dos juros serão: R$");
        return quantidadeEmprestimo * percentualAcrescimo;
    }

    public double calcularValorTotalEmprestimo(double quantidadeEmprestimo, double totalJuros) {
        System.out.print("O valor total do empréstimo com os juros será: R$");
        return quantidadeEmprestimo + totalJuros;
    }

    public double calcularValorParcela(double valorTotalEmprestimo) {
        System.out.print("O valor total da parcela do empréstimo será: R$");
        double valorParcela = valorTotalEmprestimo / parcelasEmprestimo;
        return valorParcela;
    }


}
