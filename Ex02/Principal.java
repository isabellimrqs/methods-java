package Ex02;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioBruto = EntradaSaida.obterSalario(scanner);

        double horasExtras = EntradaSaida.obterHorasExtras(scanner);

        Calculo calculo = new Calculo(salarioBruto);

        String salarioPosDescontoINSS = calculo.DescontoInss(salarioBruto);
        System.out.println(salarioPosDescontoINSS);

        String salarioPosDescontoIRPF = calculo.DescontoIRPF(salarioBruto);
        System.out.println(salarioPosDescontoIRPF);

        String salarioPosDescontoConvenio = calculo.DescontoConvenio(salarioBruto);
        System.out.println(salarioPosDescontoConvenio);

        String salarioPosAcrescimoHorasExtras = calculo.AcrescimoHoraExtra(salarioBruto, horasExtras);
        System.out.println(salarioPosAcrescimoHorasExtras);

        String salarioLiquido = calculo.SalarioLiquido(salarioBruto, horasExtras);
        System.out.println(salarioLiquido);
    }
}
