package Ex02;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chgamos a parte mais esperada dos mês..."); 
        Thread.sleep(1000);
        System.out.println("O PAGAMENTO!!!!!!!!! ❤（っ＾▿＾）");
        Thread.sleep(1000);


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
