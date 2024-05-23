package Ex03;

public class Validacao {
    public static boolean validaQuantidade(double quantidadeEmprestimo) {
        return quantidadeEmprestimo <= 200000;
    }

    public static boolean validaSeUltrapassaQuinzePorCentoSalario(double salarioAtual, double valorParcela) {
        return valorParcela <= (salarioAtual * 0.15);
    }
}
