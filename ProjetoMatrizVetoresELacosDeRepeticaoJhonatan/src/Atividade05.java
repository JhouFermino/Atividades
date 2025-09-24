import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        // Cria uma matriz 3x3
        int linha = 3;
        int coluna =  3;
        int [][] matriz = new int[linha][coluna];

        // Scanner para entrada dos números do usuário
        Scanner leitor = new Scanner(System.in);

        // Preenche a matriz com valores digitados pelo usuário
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                System.out.println("Digite o " + (j + 1) + "° numero da " + (i + 1) + "° Lista: ");
                matriz[i][j] = leitor.nextInt();
            }
        }

        // Exibindoa a matriz com a soma de cada linha
        System.out.println("Matriz com soma das linhas e colunas");
        for (int j = 0; j < linha; j++){
            int somaLinha = 0;
            for (int i = 0; i < coluna; i++){
                System.out.print(matriz[j][i] + "\t");
                somaLinha += matriz[j][i];
            }
            System.out.println("|" + somaLinha);
        }

        // Exibindo a soma de cada coluna
        System.out.println("__________");
        for (int i = 0; i < coluna; i++){
            int somaColuna = 0;
            for (int j = 0; j < linha; j++){
                somaColuna += matriz[j][i];
            }
            System.out.print(somaColuna + "\t");
        }
    }
}
