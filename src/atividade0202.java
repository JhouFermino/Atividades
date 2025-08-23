import java.util.Scanner;
public class atividade0202 {
    public static void main(String[] angs) {

        //Declaração de variável
        String nomeDoAluno;
        double notaDoAluno;
        Scanner leitor = new Scanner(System.in);

        //Usuário lê e digita
        System.out.println("Digite o seu nome: ");
        nomeDoAluno = leitor.nextLine();
        System.out.println("Digite a sua nota no Java: ");
        notaDoAluno = leitor.nextDouble();

        //Condições aninhadas
        if (notaDoAluno >= 9){
            System.out.println("Sua nota é Exelente "+ nomeDoAluno + "!");
        }
        else if  (notaDoAluno >= 8){
            System.out.println("Sua nota é Boa "+ nomeDoAluno + "!");
        }
        else if (notaDoAluno >= 6){
            System.out.println("Sua nota é Aceitável "+ nomeDoAluno + "!");
        }
        else if (notaDoAluno < 6){
            System.out.println("Sua nota é Inaceitável " + nomeDoAluno + "!");
        }
    }
}
