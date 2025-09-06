public class Atividade2 {
    public static void main (String[] args) {

        //Criando e adicionando valor ás posições do vetor
        int[] valores = new int[12];
        valores[0] = 3;
        valores[1] = 6;
        valores[2] = 9;
        valores[3] = 12;

        //criando uma operação matematica com dois valores do vetor.
        int soma = valores[0] + valores[3];

        //printando o valor da soma de dois valores na tela
        System.out.println("O valor da soma entre " + valores[0] + " + " + valores[3] + " é igual á " + soma);
    }
}
