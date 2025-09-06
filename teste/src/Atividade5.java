import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] angs){

        //criando variável e vetor
        Scanner leitor = new Scanner(System.in);
        String[] vetor = new String[3];

        //Utilizando o for com a finalidade de fazer com que o usuário insira 5 nomes de pessoas e o vetor salve estes valores dentro dele
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Insira o " + (i + 1) + "° nome: ");
            vetor[i] = leitor.nextLine();
        }

        //Utilizando o for para printar estes mesmos 5 nomes salvos pelo vetor na tela de forma rápida
        System.out.println("\nOs nomes inseridos são: ");
        for (int i = 0; i < 3; i++){
            System.out.println(vetor[i]);
        }
    }
}
