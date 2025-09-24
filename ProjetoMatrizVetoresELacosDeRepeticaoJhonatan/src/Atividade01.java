import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i + 1) + " numero: ");
            vetor[i] = leitor.nextInt();
        }


        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }


        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        //mostrará tanto o maior número quanto o menor o menor número na tela
        System.out.println("---------------");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("---------------");
    }
}