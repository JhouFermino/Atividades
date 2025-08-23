import java.util.Scanner;

public class atividade1102 {
    public static void main(String[] angs) {

        //Declaração e atribuição de variável
        double salarioBruto, valorDoBonus, salarioBrutoComBonus = 0, valorDoImposto = 0, salarioLiquido = 0;
        int anosTrabalhados;
        Scanner leitor = new Scanner(System.in);

        //Usuário Digita
        System.out.println("Digite o valor do salário Bruto: ");
        salarioBruto = leitor.nextDouble();
        System.out.println("Digite o numero de anos trabalhados: ");
        anosTrabalhados = leitor.nextInt();

        //CONDIÇÕES ANINHADAS E OPERAÇÕES MATEMÁTICAS
        //anos trabalhados com bonificações
        if (anosTrabalhados >= 10) {
            valorDoBonus = salarioBruto * 0.1;
            salarioBrutoComBonus = salarioBruto + valorDoBonus;
        } else if (anosTrabalhados >= 5) {
            valorDoBonus = salarioBruto * 0.05;
            salarioBrutoComBonus = salarioBruto + valorDoBonus;
        } else {
            valorDoBonus = salarioBruto;
        }

        //valor do salário com bonus e impostos
        if (salarioBruto >= 5000){
            valorDoImposto = salarioBrutoComBonus * 0.27;
            salarioLiquido = salarioBrutoComBonus - valorDoImposto;
        }
        else if (salarioBruto > 3000 && salarioBruto <= 4999.99){
            valorDoImposto = salarioBrutoComBonus * 0.18;
            salarioLiquido = salarioBrutoComBonus - valorDoImposto;
        }
        else if (salarioBruto <= 3000) {
            valorDoImposto = salarioBrutoComBonus * 0.1;
            salarioLiquido = salarioBrutoComBonus - valorDoImposto;
        }

        //Impressões
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("valor do bonus: " + valorDoBonus);
        System.out.println("Valor do Salário com Bonus: " + salarioBrutoComBonus);
        System.out.println("valor do imposto: " + valorDoImposto);
        System.out.println("Valor do salário liquido: " + salarioLiquido);

    }
}
