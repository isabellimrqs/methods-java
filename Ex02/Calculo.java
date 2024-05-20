package Ex02;

public class Calculo {

        //Percentuais
        double percentualINSS ;
        double percentualIRPF;
        double percentualConvenio;
        double percentualHoraExtra;

        // Descontos
        double descontoINSS;
        double descontoIRPF;
        double descontoConvenio;
        double salarioLiquido;


        public Calculo(double salarioBruto){
            this.percentualINSS = 0.20;
            this.percentualIRPF = 0.10;
            this.percentualConvenio = 0.05;
            this.percentualHoraExtra = 0.50;

            this.descontoINSS = salarioBruto * percentualINSS;
            this.descontoIRPF = salarioBruto * percentualIRPF;
            this.descontoConvenio = salarioBruto * percentualConvenio;

        }

        public String DescontoIRPF(double salarioBruto){
            return "Valor do desconto do IRPF: R$" + descontoIRPF;
        }

        public String DescontoInss(double salarioBruto){
            return "Valor do desconto do INSS: R$" + descontoINSS;
        }

        public String DescontoConvenio(double salarioBruto){
            return "Valor do desconto do plano de saúde: R$" + descontoConvenio;
        }

        public double CalcularValorTotalHoraExtra(double salarioBruto, double horasExtras) {
            double valorHoraNormal = salarioBruto / 160;
            double valorHoraExtra = valorHoraNormal * (1 + percentualHoraExtra);
            return valorHoraExtra * horasExtras;
        }

        public String AcrescimoHoraExtra(double salarioBruto, double horasExtras) {
            double valorTotalHoraExtra = CalcularValorTotalHoraExtra(salarioBruto, horasExtras);
            return "Valor total das horas extras: R$" + valorTotalHoraExtra;
        }

        public String SalarioLiquido(double salarioBruto, double horasExtras) {
            double valorTotalHoraExtra = CalcularValorTotalHoraExtra(salarioBruto, horasExtras);
            salarioLiquido = salarioBruto - descontoINSS - descontoIRPF - descontoConvenio + valorTotalHoraExtra;
            return "Salário líquido: R$" + salarioLiquido;
    }













}
