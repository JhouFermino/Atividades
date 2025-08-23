import java.util.Scanner;

public class atividade1002 {
    public static void main(String[] args) {

        //Declaração de variavel
        double valorCompra, valorFinal = 0, valorDoDesconto = 0, porcentagemDeDesconto = 0;
        Scanner leitor = new Scanner(System.in);

        //Usuário Digita
        System.out.println("Digite o valor da compra: ");
        valorCompra = leitor.nextDouble();

        //Condicionais aninhadas e operações matemáticas
        if (valorCompra >= 500) {
            porcentagemDeDesconto = 20;
            valorDoDesconto = valorCompra * porcentagemDeDesconto / 100;
            valorFinal = valorCompra - valorDoDesconto;
        }
        else if (valorCompra >= 200) {
            porcentagemDeDesconto = 10;
            valorDoDesconto = valorCompra * porcentagemDeDesconto / 100;
            valorFinal = valorCompra - valorDoDesconto;
        }
        else if (valorCompra >= 100 && valorCompra < 199.99) {
            porcentagemDeDesconto = 5;
            valorDoDesconto = valorCompra * porcentagemDeDesconto / 100;
            valorFinal  = valorCompra - valorDoDesconto;
        }
        else if (valorCompra < 100) {
            valorDoDesconto = 0;
            valorFinal = valorCompra;
        }

        //Impressões
        System.out.println("Valor Original: " + valorCompra);
        System.out.println("percentual do desconto: " + porcentagemDeDesconto);
        System.out.println("Valor do desconto: " + valorDoDesconto);
        System.out.println("Valor final: " + valorFinal);

    }
}
