package Ex01;

import java.util.Scanner;

public class EntradaSaida {

    public static double obterNota(Scanner scanner, String mensagem) {

        double nota;
        do {
            System.out.print(mensagem);
            nota = scanner.nextDouble();
        } while (!Validacao.validarNota(nota));
        return nota;
    }

    public static String obterTipoMedia(Scanner scanner) {
        System.out.println("Qual tipo de média deseja calcular? \n A) Aritmética \n B) Ponderada");
        return scanner.next();
    }

    public static double obterPeso(Scanner scanner, String mensagem) {
        double peso;
        do {
            System.out.print(mensagem);
            peso = scanner.nextDouble();
        } while (!Validacao.validarPeso(peso));
        return peso;
    }
}



