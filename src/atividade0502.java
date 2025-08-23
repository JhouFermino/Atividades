import java.util.Scanner;

public class atividade0502 {
    public static void main (String[] args) {

        //Declaração de variavel
        int semana;
        Scanner leitor = new Scanner(System.in);

        //Usuario lê e digita
        System.out.println("Digite um numero de 1 a 7: ");
        semana = leitor.nextInt();

        //condição
        if (semana < 1 || semana > 7) {
        System.out.println("ERRO!");
        }
        switch (semana) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}
