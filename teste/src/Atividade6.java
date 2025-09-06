import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){

        //Criando vetor e Scanner
        int[] vetor = new int[10];
        Scanner leitor = new Scanner(System.in);

        //O for irá fazer com que o usuário possa digitar um valor aleatório e adicionar cada um em cada posição do vetor 10 vezes
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetor[i] = leitor.nextInt();
        }

        //printei para que haja uma separação decorativa na tela
        System.out.println("|=====================|");

        //Destes valores digitados pelo usuário caso algum for par será escrito abaixo
        for (int i = 0; i < 10; i++){

            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);

            }
        }
    }
}
