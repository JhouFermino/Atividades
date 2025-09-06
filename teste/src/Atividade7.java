import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args){

        //Criação do Scanner e vetor
        Scanner leitor = new Scanner(System.in);

        String[] nome = new String[15];

        //Este For fara com que o usuário digite um nome aleatório e adicione cada valor em cada posicção do vetor até 15 vezes!!!
        for (int i = 0; i < nome.length; i++){
            System.out.println("Digite o " + (i + 1) + "° nome: ");
            nome[i] = leitor.nextLine();
        }

        System.out.println("|===============|");

        //E este For printará os nomes digitados só que em ordem contrária
        for (int i = 14; i > 0; i--){
            System.out.println(nome[i]);
        }
    }
}
