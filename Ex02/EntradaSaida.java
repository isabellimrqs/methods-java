package Ex02;
import java.util.Scanner;

public class EntradaSaida {

    public static double obterSalario(Scanner scanner) {
        double salarioBruto;
        while (true) {
            System.out.print("Por favor, digite seu salario: R$");
            salarioBruto = scanner.nextDouble();

            if (Validacao.validaSalario(salarioBruto)) {
                break;
            } else {
                System.out.print("Por favor, digite um valor de salário válido (entre R$500 e R$30.000).");
            }
        }

        return salarioBruto;
    }
    public static double obterHorasExtras(Scanner scanner) {
        System.out.print("Digite a quantidade de horas extras feitas: ");
        return scanner.nextDouble();
    }



}
