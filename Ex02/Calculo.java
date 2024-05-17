package Ex02;

public class Calculo {

        //Percentuais
        double percentualINSS = 0.20;
        double percentualIRPF = 0.10;
        double percentualConvenio = 0.05;
        double percentualHoraExtra = 0.50;

        // Descontos
        double descontoINSS;
        double descontoIRPF;
        double descontoConvenio;


        public Calculo(double salarioBruto){
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

        //public String AcrescimoHoraExtra(){}












}
