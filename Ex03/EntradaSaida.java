package Ex03;

import java.util.Scanner;
public class EntradaSaida {

    public static double obterSalarioAtual(Scanner scanner){
        double salarioAtual, valorParcela = 0;
        while (true){
            System.out.println("Digite seu salário atual: ");
            salarioAtual = scanner.nextDouble();

            if (Validacao.validaSeUltrapassaQuinzePorCentoSalario(salarioAtual,valorParcela)){
                break;
            } else {
                System.out.println("O valor da parcela não pode exceder 15% do salário.... :(");
            }

        }

        return salarioAtual;
    }

    public static double obterQuantidadeEmprestimo(Scanner scanner){
        double quantidadeEmprestimo;
        while (true){
            System.out.println("Digite a quantidade que você deseja emprestar: ");
            quantidadeEmprestimo = scanner.nextDouble();

            if (Validacao.validaQuantidade(quantidadeEmprestimo)){
                break;
            } else {
                System.out.println("O valor do empréstimo não pode exceder R$200.000,00");
            }
        }

        return quantidadeEmprestimo;
    }


}
