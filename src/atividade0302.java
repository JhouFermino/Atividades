import java.util.Scanner;

public class atividade0302 {
    public static void main(String[] args) {

        //Declaração de valores
        int numero;
        Scanner leitor = new Scanner(System.in);

        //Usuário lê e digita
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        //condição
        if (numero % 2 == 0){
            System.out.println("O número é par");
        }
        else if (numero % 2 == 1) {
            System.out.println("O número é Impar");
        }
    }
}
