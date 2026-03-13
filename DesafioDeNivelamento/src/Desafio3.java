import java.util.Scanner;
import java.util.ArrayList;

class produto{
    String nome;
    int quantidade;
    Double valor;

    produto(String nome, int quantidade, Double valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor= valor;
    }
}

public class Desafio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<produto> estoque = new ArrayList<>();

        Double financeiro = 100.0;

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("1 - Compra");
            System.out.println("2 - Venda");
            System.out.println("3 - Estoque");
            System.out.println("4 - Financeiro");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.next();

                    System.out.println("Digite o valor do produto: ");
                    Double valor = scanner.nextDouble();

                    System.out.println("Digite a quantidade de produtos: ");
                    int quantidade = scanner.nextInt();

                    estoque.add(new produto(nome, quantidade, valor));
                    financeiro -= valor * quantidade;
                    break;

                case 2:
                    System.out.println("Digite o produto que deseja vender: ");
                    String busca = scanner.next();

                    for (produto p : estoque) {
                        if (p.nome.equalsIgnoreCase(busca)) {

                            System.out.println("Digite a quantidade: ");
                            int vendaqntd = scanner.nextInt();

                            if (p.quantidade >= vendaqntd) {
                                p.quantidade -= vendaqntd;
                                financeiro += p.valor * vendaqntd * 1.05;
                                System.out.println("Venda realizada com sucesso!");
                            } else {
                                System.out.println("Estoque insuficiente! COMPRE MAIS!");
                            }
                        }
                break;
                    }
                case 3:
                    for(produto p : estoque) {
                        System.out.println(p.nome + "| Preço: " + p.valor + "| Quantidade: " + p.quantidade);
                    }

                break;

                case 4:
                    System.out.println("Valor atual na conta: R$ " + financeiro);
                break;
            }


        }
    }
}