import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] angs){

        //Criando Scanner e vetores
        Scanner leitor = new Scanner(System.in);
        String[] modeloCarros = new String[5];
        double[] quilometros = new double[5];

        //Este for solicitará para que o usuário insira 5 modelos de carros, cada um será salvo na String[] modeloCarros.
        for (int i = 0; i < 5; i++){
            System.out.println("Digite o "+ (i + 1) +"° modelo do carro: ");
            modeloCarros[i] = leitor.next();
        }

        System.out.println("|=======||============||=========||===========|");

        //Este for silicitará quantos km resptivamente cada modelo de carro faz com 1lt de combustivel salvando cada valor no Double[] quilometros.
        for (int i = 0; i < 5; i++){
            System.out.println("Insira quantos Km o " + (modeloCarros[i]) + " faz com 1 litro de combustível: ");
            quilometros[i] = leitor.nextDouble();
        }

        System.out.println("|=======||============||=========||===========|");

        //Criando variáveis que serão utilizadas para fazer as operações no próximo For, no double Maior consumo; fiz com que o quilometros[0] se tornasse o maior por enquanto..
        double maiorConsumo = quilometros[0];
        int maisEconomico =0;

        //neste for criei um if para caso o Vetor quilometros[i] fosse maior que maiorConsumo{quilometro[0]}, ele irá substituir o valor de quilometro[0] dentro da variável maiorConsumo.
        //no final quem tiver o maior numero de km será o mais econômico.
        for (int i = 1; i < quilometros.length; i++){
            if (quilometros[i] > maiorConsumo) {
                maiorConsumo = quilometros[i];
                maisEconomico = i;
            }
        }

        //Printará usando o valor da posição do Modelo de carro mais economico utilizando o indice armazenada na variável maisEcônomico;
        System.out.println("O carro mais economico é: " + modeloCarros[maisEconomico]);

        //Dentro deste For estará sendo feita uma operação de quantos litros de gasolina cada carro consumiu se baseando na quantidade de km andado.
        for (int i = 0; i < quilometros.length; i++){
            double litros = 1000.0 / quilometros[i];

            //printando a quantidade de litros de gasolina consumida por cada carro respectivamente.
            System.out.println("O " + (i + 1)+ "° carro: " + modeloCarros[i] + " Consome " + (int)litros + " Litros de gasolina");
        }
    }
}
