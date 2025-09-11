import java.util.Random;
import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
        Random sortear = new Random();

        char[][] campo = new char [linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                campo[i][j] = '⌀';
                System.out.print(" ⌀ ");
            }
            System.out.println(" ");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas bombas vamos adicionar?");
        int quantidade = scanner.nextInt();

        int plantada = 0;
        while (plantada < quantidade) {
            int linhaSorteio = sortear.nextInt(linhas);
            int colunaSorteio = sortear.nextInt(colunas);

            char valorPosicao = campo[linhaSorteio][colunaSorteio];

            if(valorPosicao == '⌀'){
                campo[linhaSorteio][colunaSorteio] = '⁂';
                plantada++;
            }


        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(" " +  campo[i][j] + " ");
            }
            System.out.println(" ");
        }

        boolean continuar = true;
        /*
         * DESAFIO
         *
         * - Quando o jogador descobrir todos os campos vazios ele
         * deve ganhar o jogo, aprimore o codigo pra isso.
         *
         * REGRA
         * - Não pode mudar nada além do DO WHILE
         * - Crie a variável tentativas do tipo int
         * */

        int tentativas = (linhas * colunas) - quantidade;
        do {

            System.out.println("Informe uma linha: ");
            int linhaEscolhida = scanner.nextInt();

            System.out.println("Informe uma coluna: ");
            int colunaEscolhida = scanner.nextInt();

            char valorEscolhido = campo[linhaEscolhida - 1][colunaEscolhida - 1];


            if( valorEscolhido == '⁂') {
                System.out.println("BOMBA INFERNAL!");
                continuar = false;
            }else if (valorEscolhido == '-'){
                System.out.println("ESTE CAMPO JÁ FOI SELECIONADO!");
                for (int i = 0; i < linhas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        System.out.print(" " +  campo[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            } else {
                System.out.println("CAMPO VAZIO! 10");
                campo[linhaEscolhida - 1][colunaEscolhida -1] = '-';
                tentativas--;
                if(tentativas == 0) {
                    continuar = false;
                }
                for (int i = 0; i < linhas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        System.out.print(" " +  campo[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            }
        }while(continuar);


    }
}
//Desafio
//Quando o jogador descobrir todos os campos vazios ele deve ganhar o jogo, aprimore o codigo para isso.
//Regra - não pode mudar nada alem do dowhile
//Crie a variavel tentativas do tipo int