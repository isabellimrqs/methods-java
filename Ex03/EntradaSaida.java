package Ex03;
import java.util.Scanner;
public class EntradaSaida {

    public static double obterSalarioAtual(Scanner scanner){
        System.out.println("Digite seu salário atual: ");
        return scanner.nextDouble();
    }

    public static double obterQuantidadeEmprestimo(Scanner scanner){
        System.out.println("Digite a quantidade que você deseja emprestar: ");
        return scanner.nextDouble();
    }


}
