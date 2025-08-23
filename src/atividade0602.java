import java.util.Scanner;

public class atividade0602 {
    public static void main (String[] args) {

        //Declaração de variaveis
        String nome;
        double mediaFinal;
        Scanner leitor = new Scanner(System.in);

        //Usuario lê e digita
        System.out.println("Digite o nome do aluno: ");
        nome = leitor.nextLine();
        System.out.println("Digite a media do aluno;");
        mediaFinal = leitor.nextDouble();

        //Condições
        if (mediaFinal >= 6) {
            System.out.println("O aluno " + nome + " Foi aprovado!");
        }
        else if (mediaFinal >= 5) {
            System.out.println("O aluno " + nome + " está de recuperação!");
        }
        else if (mediaFinal < 5) {
            System.out.println("O aluno " + nome + " Foi reprovado!");
        }
    }
}
