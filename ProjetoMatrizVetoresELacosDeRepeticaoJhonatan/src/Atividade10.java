import java.util.Random;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        // Aqui estarei definindo as variáveis principais
        int totalLinhas = 7;
        int totalColunas = 7;
        Scanner entrada = new Scanner(System.in);
        Random sorteio = new Random();
        String[][] mapaDoJogador = new String[totalLinhas][totalColunas];
        String[][] mapaSecreto = new String[totalLinhas][totalColunas]; // Não é exibido para o jogador
        String simboloAgua = " ~ ";
        String simboloErro = " x ";
        String simboloNavio = " # ";
        String iconeTubarao = " 🦈 ";
        String iconeLula = " 🦑 ";
        String iconeCamarao = " 🦐 ";
        String iconeBaleia = " 🐋 ";

        // Apresentação inicial
        System.out.println("===============================================");
        System.out.println("Batalha Naval Simplificado");
        System.out.println("===============================================");
        System.out.println("Objetivo: Escolha a linha e a coluna para atacar \ne descubra se acertou um navio. Existem 3 navios \nno mapa e você vence ao encontrar todos eles \nantes de acabar suas jogadas.");
        System.out.println("===============================================");
        System.out.println("LEGENDA:");
        System.out.println("Água não explorada: " + simboloAgua);
        System.out.println("Tiro na água: " + simboloErro);
        System.out.println("Navio atingido: " + simboloNavio);
        System.out.println("===============================================");


        // Criação dos mapas
        inicializarMapas(mapaDoJogador, mapaSecreto, simboloAgua);


        // inseriondo barcos e animais no mapa
        posicionarElementos(totalLinhas, totalColunas, sorteio, mapaSecreto, simboloAgua, simboloNavio,
                iconeTubarao, iconeLula, iconeCamarao, iconeBaleia);



        // Loop principal
        int tentativasRestantes = totalLinhas * totalColunas;
        int naviosEncontrados = 0;
        while (tentativasRestantes >= 1 && naviosEncontrados < 3) {
            mostrarMapa(mapaDoJogador);
            System.out.println("===============================================");
            System.out.println("TENTATIVAS RESTANTES: " + tentativasRestantes);
            System.out.println("===============================================");

            // Entrada do jogador
            System.out.println("Informe o número da LINHA:");
            int linhaEscolhida = entrada.nextInt() - 1;
            System.out.println("Informe o número da COLUNA:");
            int colunaEscolhida = entrada.nextInt() - 1;

            // Verificação da jogada
            if(mapaDoJogador[linhaEscolhida][colunaEscolhida].equals(simboloAgua)) {
                if(mapaSecreto[linhaEscolhida][colunaEscolhida].equals(simboloAgua)) {
                    mapaDoJogador[linhaEscolhida][colunaEscolhida] = simboloErro;
                    tentativasRestantes--;
                    System.out.println("Nenhum navio encontrado nesta posição.");
                } else if (mapaSecreto[linhaEscolhida][colunaEscolhida].equals(simboloNavio)) {
                    mapaDoJogador[linhaEscolhida][colunaEscolhida] = simboloNavio;
                    tentativasRestantes--;
                    naviosEncontrados++;
                    System.out.println("Você acertou um navio!");
                } else if(mapaSecreto[linhaEscolhida][colunaEscolhida].equals(iconeTubarao)) {
                    System.out.println("Você atingiu um tubarão! (-5 tentativas)");
                    mapaDoJogador[linhaEscolhida][colunaEscolhida] = iconeTubarao;
                    tentativasRestantes -= 5;
                } else if(mapaSecreto[linhaEscolhida][colunaEscolhida].equals(iconeBaleia)) {
                    System.out.println("Você atingiu uma baleia! (-10 tentativas)");
                    mapaDoJogador[linhaEscolhida][colunaEscolhida] = iconeBaleia;
                    tentativasRestantes -= 10;
                } else if(mapaSecreto[linhaEscolhida][colunaEscolhida].equals(iconeCamarao)) {
                    System.out.println("Você atingiu milhares de camarões! (-3 tentativas)");
                    mapaDoJogador[linhaEscolhida][colunaEscolhida] = iconeCamarao;
                    tentativasRestantes -= 3;
                } else if(mapaSecreto[linhaEscolhida][colunaEscolhida].equals(iconeLula)) {
                    System.out.println("Você atingiu uma lula! (-13 tentativas)");
                    mapaDoJogador[linhaEscolhida][colunaEscolhida] = iconeLula;
                    tentativasRestantes -= 13;
                }
            } else {
                System.out.println("Esta posição já foi escolhida, tente outra!");
            }

            // Pausa para leitura
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        // Resultado final
        if(naviosEncontrados == 3) {
            System.out.println("===============================================");
            System.out.println("PARABÉNS! Você venceu a batalha marítima!");
            System.out.println("===============================================");
        } else {
            System.out.println("===============================================");
            System.out.println("Fim das tentativas! Você perdeu o jogo.");
            System.out.println("===============================================");
        }
    }



    public static void inicializarMapas(String[][] mapaDoJogador, String[][] mapaSecreto, String simboloAgua) {
        for(int i = 0; i < mapaDoJogador.length; i++) {
            for(int j = 0; j < mapaDoJogador[i].length; j++) {
                mapaDoJogador[i][j] = simboloAgua;
                mapaSecreto[i][j] = simboloAgua;
            }
        }
    }



    public static void posicionarElementos(int totalLinhas, int totalColunas, Random sorteio, String[][] mapaSecreto,
                                           String simboloAgua, String simboloNavio, String iconeTubarao, String iconeLula, String iconeCamarao, String iconeBaleia) {
        int naviosColocados = 0;
        while (naviosColocados < 3) {
            int linhaSorteada = sorteio.nextInt(totalLinhas);
            int colunaSorteada = sorteio.nextInt(totalColunas);

            if(mapaSecreto[linhaSorteada][colunaSorteada].equals(simboloAgua)) {
                mapaSecreto[linhaSorteada][colunaSorteada] = simboloNavio;
                naviosColocados++;

                if(naviosColocados == 3) {
                    int criaturasColocadas = 0;
                    while (criaturasColocadas < 4) {
                        int linhaAnimal = sorteio.nextInt(totalLinhas);
                        int colunaAnimal = sorteio.nextInt(totalColunas);

                        if(mapaSecreto[linhaAnimal][colunaAnimal].equals(simboloAgua)) {
                            switch (criaturasColocadas) {
                                case 0: mapaSecreto[linhaAnimal][colunaAnimal] = iconeTubarao; break;
                                case 1: mapaSecreto[linhaAnimal][colunaAnimal] = iconeLula; break;
                                case 2: mapaSecreto[linhaAnimal][colunaAnimal] = iconeCamarao; break;
                                case 3: mapaSecreto[linhaAnimal][colunaAnimal] = iconeBaleia; break;
                            }
                            criaturasColocadas++;
                        }
                    }
                }
            }
        }
    }



    public static void mostrarMapa(String[][] mapaDoJogador) {
        for(int i = 0; i < mapaDoJogador.length; i++) {
            for(int j = 0; j < mapaDoJogador[i].length; j++) {
                System.out.print(mapaDoJogador[i][j]);
            }
            System.out.println(" ");
        }
    }
}
