package Ex03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioAtual = EntradaSaida.obterSalarioAtual(scanner);
        double quantidadeEmprestimo = EntradaSaida.obterQuantidadeEmprestimo(scanner);

        Calculo calculo = new Calculo();

        if (!Validacao.validaQuantidade(quantidadeEmprestimo)) {
            System.out.println("O valor do empréstimo não pode exceder R$200.000,00.");
            return;
        }

        double totalJuros = calculo.calcularValorTotalJuros(quantidadeEmprestimo);
        double valorTotalEmprestimo = calculo.calcularValorTotalEmprestimo(quantidadeEmprestimo, totalJuros);
        double valorParcela = calculo.calcularValorParcela(valorTotalEmprestimo, salarioAtual);

        if (!Validacao.validaSeUltrapassaQuinzePorCentoSalario(salarioAtual, valorParcela)) {
            System.out.println("O valor da parcela não pode exceder 15% do salário.");
            return;
        }

        System.out.println("Você pode realizar o empréstimo.");
        System.out.println("Valor total dos juros: R$" + totalJuros);
        System.out.println("Valor total do empréstimo com juros: R$" + valorTotalEmprestimo);
        System.out.println("Valor de cada parcela: R$" + valorParcela);
    }
}
