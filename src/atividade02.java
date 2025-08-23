public class atividade02 {
    public static void main(String[] angs) {

        //Declaração de variáveis
        String nome = "Rogério";
        int idade = 22;
        double salarioBrutoMensal = 1000;
        int mesesTrabalhados = 10;
        int produtosComprados = 120;
        double valorProduto = 20.50;

        //operações simples
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados;
        double salarioAnualLiquido = salarioAnualBruto - 200;
        double mediaProdutos = produtosComprados / valorProduto;
        String apresentacao = "Olá, " + nome + " o válor do seu salário anual líquido é de " + salarioAnualLiquido + "R$";

        //impressões
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto mensal: " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Produtos Comprados: " + produtosComprados);
        System.out.println("Valor do Produto: " + valorProduto);
        System.out.println("Salário Anual Bruto: " + salarioAnualBruto);
        System.out.println("Salário Anual líquido: " + salarioAnualLiquido);
        System.out.println("Media Produtos: " + mediaProdutos);
        System.out.println("Apresentacao: " + apresentacao);

    }
}
