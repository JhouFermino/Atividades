import java.util.Objects;
import java.util.Scanner;

public class atividade0402 {
    public static void main(String[] args) {

        //Declaração de variavel
        String nomeDeUsuario;
        String senha;
        Scanner leitor = new Scanner(System.in);

        //Usuário lê e digita
        System.out.println("Nome de Usuário:");
        nomeDeUsuario = leitor.nextLine();
        System.out.println("Senha:");
        senha = leitor.nextLine();

        //condição
        if (Objects.equals(nomeDeUsuario, "Jhonatan Fermino Da Silva") && Objects.equals(senha, "Fermino5")) {
            System.out.println("Pode entrar, mas não tropece!");
        }
        else {
            System.out.println("Saia desconhecido!");
        }
    }
}
