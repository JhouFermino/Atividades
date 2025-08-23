import java.util.Scanner;

public class atividade0902 {
    public static void main(String[] args) {

        //Declaração de variável
        double numero;
        Scanner leitor = new Scanner(System.in);

        //Usuário Digita
        System.out.println("Digite um numero: ");
        numero = leitor.nextDouble();

        //Condições
        if (numero > 0){
            System.out.println("O numero é positivo!");
        }
        else if (numero < 0){
            System.out.println("O numero é negativo!");
        }
        else{
            System.out.println("O numero é ZERO!");
        }
    }
}
