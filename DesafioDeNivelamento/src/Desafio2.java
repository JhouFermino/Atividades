import java.util.EnumSet;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");

        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");

        int numero2 = scan.nextInt();


        System.out.println("======================");
        System.out.println("1- Soma");

        System.out.println("2- Subtração");

        System.out.println("3- multiplicação");

        System.out.println("4-Divisão");

        System.out.println("Escolha uma operação: ");
        int escolha = scan.nextInt();
        System.out.println("======================");
        switch (escolha) {
            case 1:
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                System.out.println(numero1 / numero2);
                break;
            default:
                System.out.println("Digite algum número acima!");

        }

    }
}
