public class atividade03 {
    public static void main(String[] angs) {

        //declaração de variaveis
        String nomeProduto = "Celular";
        double precoUnitarioProduto = 649.99;
        int quantidadeProduto = 2100;
        double taxaSobreProduto = 0.5;
        double lucroDesejado = 50000;

        //operações simples
        double valorTotalSemImp = precoUnitarioProduto * quantidadeProduto;
        double valorTotalComImp = valorTotalSemImp * taxaSobreProduto;
        double precoDeVenda = valorTotalComImp * (1 + lucroDesejado);


        //impressões
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Preço unitário do Produto: " + precoUnitarioProduto);
        System.out.println("Quantidade do produto: " + quantidadeProduto);
        System.out.println("Taxa Sobre o Produto: " + taxaSobreProduto);
        System.out.println("Margem de lucro desejado: " + lucroDesejado);
        System.out.println("Valor Total do produto sem impostos: " + valorTotalSemImp);
        System.out.println("valor Total do produto Com Impostos: " + valorTotalComImp);
        System.out.println("Preço De Venda: " + precoDeVenda);
    }
}
