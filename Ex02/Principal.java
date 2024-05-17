package Ex02;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        double salarioBruto = scanner.nextDouble();

        Calculo calculo = new Calculo(salarioBruto);

        String salarioPosDescontoINSS = calculo.DescontoInss(salarioBruto);
        System.out.println(salarioPosDescontoINSS);

        String salarioPosDescontoIRPF = calculo.DescontoIRPF(salarioBruto);
        System.out.println(salarioPosDescontoIRPF);

        String salarioPosDescontoConvenio = calculo.DescontoConvenio(salarioBruto);
        System.out.println(salarioPosDescontoConvenio);



    }


}
