import java.util.Scanner;
public class atividade0102 {
    public static void main(String[] angs) {

        //criação de variável
        int idade;
        Scanner leitor = new Scanner(System.in);

        //Usuário lê e digita
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        //Condição
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade!");
        }
    }
}
