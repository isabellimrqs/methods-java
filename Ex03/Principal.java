package Ex03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioAtual = EntradaSaida.obterSalarioAtual(scanner);
        double quantidadeEmprestimo = EntradaSaida.obterQuantidadeEmprestimo(scanner);


    }
}
