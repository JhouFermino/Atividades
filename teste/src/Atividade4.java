import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){

        //Criando variaveis, vetor e Scanner
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        double soma = 0;
        int[] vetor = new int[3];

        //Aqui é o local em que crio o for e faço com que o usuario digite três valores utilisando o Scanner!! (╭ರ_•́)
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetor[i] = leitor.nextInt();
        }

        //Estarei exibindo aqui os valores inseridos pelo usuário!!! (╭ರ_•́)
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "° valor: " + vetor[i]);
        }

        //Aqui o valores inseridos pelo usuário serão somados e em seguida divididos entregando o resultado da média!!! estou explicando muito bem explicado para que o cleiton entenda... e me uma nota a mais (╭ರ_•́)
        for(int i = 0; i < 3; i++){
            soma = soma + vetor[i];
            media = soma / 3;
        }

        //linha de código aoto explicativo, printando o valor da média.
        System.out.println("A média de todos os valores é: " + media);
    }
}
