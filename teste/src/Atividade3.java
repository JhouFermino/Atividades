import java.util.Scanner;
public class Atividade3 {
    public static void main (String[] args){

        //Criando o Scanner
        Scanner leitor = new Scanner (System.in);

        //Criando e atribuindo valores ás posições vetor
        int[] valor = new int[2];
        valor[0] = 5;
        valor[1] = 10;

        //Printando o valor do vetor antes da troca
        System.out.println("Valor antes da troca: Valores[0] =  " + valor[0] +  " Valores[1] =  " + valor[1]) ;

        //criando um for para que o usuario possa modificar os valores sem que crie muitas linhas de código
        for(int i= 0; i < 2; i++){
            System.out.println("Digite o valor da " + (i+1) + "° posicao:  ");
            valor[i] = leitor.nextInt();
        }

        //Printando na tela o valor modificado
        System.out.println("Valor atual:  valores[0] =  " + valor[0] +  " valores[1] =  " + valor[1]);

    }
}