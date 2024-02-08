import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = scanner.nextInt();

        int soma = A + B;

        if (soma > C) {
            System.out.println("A soma de A + B é maior que C.");
        } else if (soma < C) {
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B é igual a C.");
        }
    }
}
