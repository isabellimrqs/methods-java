package Ex01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá professor! Bem vindo ao sistema de cálculo de notas! :D");
        Thread.sleep(1000);

        double nota1 = EntradaSaida.obterNota(scanner, "Por favor, digite a primeira nota: ");
        double nota2 = EntradaSaida.obterNota(scanner, "Digite a segunda nota: ");

        String tipoMedia = EntradaSaida.obterTipoMedia(scanner);

        double media = 0;
        if (tipoMedia.equalsIgnoreCase("A")) {
            media = Calculo.calcularMediaAritmetica(nota1, nota2);
        } else if (tipoMedia.equalsIgnoreCase("B")){
            double peso1 = EntradaSaida.obterPeso(scanner, "Por favor, digite peso da primeira nota: ");
            double peso2 = EntradaSaida.obterPeso(scanner, "Digite o peso da segunda nota: ");
            media = Calculo.calcularMediaPonderada(nota1, nota2, peso1, peso2);
        } else {
            System.out.println("Desculpe, não entendi... ");
            Thread.sleep(500);
            System.out.println("Por favor, tente novamente.");

        }

        Resultado.mostrarResultado(media);
    }
}





