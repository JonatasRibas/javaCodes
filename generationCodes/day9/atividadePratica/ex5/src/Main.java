import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto (de 1 a 6): ");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco = 0;
        String nomeProduto = "";

        switch (codigo) {
            case 1:
                preco = 10.00;
                nomeProduto = "Cachorro Quente";
                break;
            case 2:
                preco = 15.00;
                nomeProduto = "X-Salada";
                break;
            case 3:
                preco = 18.00;
                nomeProduto = "X-Bacon";
                break;
            case 4:
                preco = 12.00;
                nomeProduto = "Bauru";
                break;
            case 5:
                preco = 8.00;
                nomeProduto = "Refrigerante";
                break;
            case 6:
                preco = 13.00;
                nomeProduto = "Suco de laranja";
                break;
            default:
                System.out.println("Código de produto inválido.");
                break;
        }

        double valorTotal = preco * quantidade;

        if (codigo >= 1 && codigo <= 6) {
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Valor total da conta: R$ " + valorTotal);
        }

    }
}
