import java.text.DecimalFormat;
import java.util.Random;

public class Atividade09 {
    public static void main(String[] args) {

        // Variáveis principais
        DecimalFormat formatador = new DecimalFormat("0.0");
        double[][] registrosDeNotas = new double[5][2];

        System.out.println("=================================");
        System.out.println("LISTAGEM DAS NOTAS DOS ESTUDANTES");
        System.out.println("=================================");
        // Exibe todas as notas
        exibirNotas(registrosDeNotas, formatador);

        System.out.println("==============================");
        System.out.println("MÉDIA FINAL DE CADA ESTUDANTE");
        System.out.println("==============================");
        // Calcula e mostra as médias
        calcularMedias(registrosDeNotas, formatador);

    }

    public static void calcularMedias(double[][] registrosDeNotas, DecimalFormat formatador) {
        double somaNotas = 0;
        for(int i = 0; i < registrosDeNotas.length; i++){
            for(int j = 0; j < registrosDeNotas[i].length; j++){
                somaNotas += registrosDeNotas[i][j];
            }
            double mediaFinal = somaNotas / registrosDeNotas[i].length;
            System.out.println((i + 1) + "° Estudante: " + formatador.format(mediaFinal));
            somaNotas = 0;
        }
    }

    public static void exibirNotas(double[][] registrosDeNotas, DecimalFormat formatador) {
        Random sorteio = new Random();
        for(int i = 0; i < registrosDeNotas.length; i++){
            System.out.print((i + 1) + "° Estudante: ");
            for(int j = 0; j < registrosDeNotas[i].length; j++){
                registrosDeNotas[i][j] = sorteio.nextDouble(10);
                System.out.print(" | " + formatador.format(registrosDeNotas[i][j]) + " | ");
            }
            System.out.println(" ");
        }
    }
}