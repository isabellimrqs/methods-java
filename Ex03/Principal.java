package Ex03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double quantidadeEmprestimo = EntradaSaida.obterQuantidadeEmprestimo(scanner);
        double salarioAtual = EntradaSaida.obterSalarioAtual(scanner);


        Calculo calculo = new Calculo();

        double totalJuros = calculo.calcularValorTotalJuros(quantidadeEmprestimo);
        System.out.println(totalJuros);

        double valorTotalEmprestimo = calculo.calcularValorTotalEmprestimo(quantidadeEmprestimo, totalJuros);
        System.out.println(valorTotalEmprestimo);

        double valorParcela = calculo.calcularValorParcela(valorTotalEmprestimo);
        System.out.println(valorParcela);








    }
}
