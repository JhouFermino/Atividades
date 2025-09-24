import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){

        int linha;
        int coluna;

        Scanner leitor = new Scanner(System.in);

        linha = 3;
        coluna = 3;


        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o " + (j + 1) + "° numero da lista da " + (i + 1) +"° linha :");
                matriz[i][j] = leitor.nextInt();
            }
        }

        System.out.println("-------");
        for (int i = 0; i < linha; i++) {

            for (int j =0; j < coluna; j++){
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");

        }
        System.out.println("-------");
    }
}