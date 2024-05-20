package Ex02;

public class Validacao {

    double salarioBruto;

    public Validacao(double salarioBruto, double horasExtras) {
        this.salarioBruto = salarioBruto;
    }

    public static boolean validaSalario(double salarioBruto) {
        return salarioBruto >= 500 && salarioBruto <= 30000;
    }
    }



