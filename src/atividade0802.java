import java.util.Scanner;

public class atividade0802 {
    public static void main(String[] args) {

        //Declaração de variável
        double temperatura;
        Scanner leitor = new Scanner(System.in);

        //Usuário digita
        System.out.println("Digite a temperatura em graus: ");
        temperatura = leitor.nextDouble();

        //Condicões
        if (temperatura >= 30) {
            System.out.println("Atualmente a temperatura está Quente");
        }
        else if (temperatura < 15) {
            System.out.println("Atualmente a temperatura está Fria");
        }
        else {
            System.out.println("Atualmente a temperatura está Agradável");
        }

    }
}
