import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        //Criando Scanner e VetorA
        Scanner leitor = new Scanner(System.in);
        int[] vetorA =new int[8];


        //Este for fará com que o usuário digite 8 valores inteiros adicionando cada um em cada posição do vetor
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = leitor.nextInt();
        }


        //Criando VetorB e criando um for com objetivo de fazer com que cada valor digitado no VetorA seja multiplicado e printado pelo VetorB respectivamente
        int[] vetorB = new int[8];
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * 3;
            System.out.println(vetorB[i]);
        }
    }
}
