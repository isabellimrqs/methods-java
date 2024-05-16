package Ex01;

public class Validacao {

        double nota;
        double peso;

        public Validacao(double nota, double peso){
            this.nota = nota;
            this.peso = peso;
        }
        public static boolean validarNota(double nota) {
            return nota >= 0 && nota <= 10;
        }

        public static boolean validarPeso(double peso) {
            return peso > 0;
        }
    }


