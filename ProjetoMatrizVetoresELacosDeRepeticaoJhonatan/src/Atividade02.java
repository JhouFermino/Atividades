import java.util.Random;

public class Atividade02 {
    public static void main(String[] args){

        //criando o vetor com número de espaços e o gerador
        int[] vetor = new int[15];
        Random gerador = new Random();


        for(int i=0; i<vetor.length; i++){
            vetor[i] = gerador.nextInt((100 - 1) + 1) + 1;

            if(vetor[i] % 2 == 0){
                System.out.println("O " + (i + 1) + "° número, sendo ele " + vetor[i] + " é Par!");
            }

            else{
                System.out.println("O " + (i + 1) + "° número, sendo ele " + vetor[i] + " é Impar!");
            }
        }

    }
}
