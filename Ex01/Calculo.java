package Ex01;

public class Calculo  {

    double nota1;
    double nota2;
    double peso1;
    double peso2;

    public Calculo(double nota1, double nota2,double peso1, double peso2 ){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.peso1 = peso1;
        this.peso2 = peso2;
    }



    public static double calcularMediaAritmetica(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static double calcularMediaPonderada(double nota1, double nota2, double peso1, double peso2) {
        return (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
    }
}

