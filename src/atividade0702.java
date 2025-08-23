import java.util.Scanner;

public class atividade0702 {
    public static void main(String[] args) {

        //Declaração de variavel
        double n1, n2;
        int opcao;
        double soma, subtracao, multiplicacao, divisao;
        Scanner leitor = new Scanner(System.in);

        //Usuário digita
        System.out.println("Digite um numero:");
        n1 = leitor.nextDouble();
        System.out.println("Digite outro numero:");
        n2 = leitor.nextDouble();

        //sistema de escolha de operações Switch
        System.out.println("Selecione uma operação");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.println("Digite sua opção:");
        opcao = leitor.nextInt();

        switch (opcao){
            case 1:
                soma = n1 + n2;
                System.out.println("O resultado da soma é: " + soma);
                break;
            case 2:
                subtracao = n1 - n2;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;
            case 3:
                multiplicacao = n1 * n2;
                System.out.println("O resultado da multiplicação é: " + multiplicacao);
                break;
            case 4:
                divisao = n1 / n2;
                System.out.println("O resultado da divisão é: " + divisao);
                break;
        }
    }
}
