import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float saldo = 1000.00f;

        while (true) {
            System.out.println("Saldo atual: R$ " + saldo);

            System.out.println("Digite o código da operação (1 - Saldo, 2 - Saque, 3 - Depósito, 4 - Sair): ");
            int codigoOperacao = scanner.nextInt();

            switch (codigoOperacao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    float valorSaque = scanner.nextFloat();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente para o saque!");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    float valorDeposito = scanner.nextFloat();
                    saldo += valorDeposito;
                    System.out.println("Depósito de R$ " + valorDeposito + " realizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                default:
                    System.out.println("Operação Inválida!");
            }
        }
    }
}
