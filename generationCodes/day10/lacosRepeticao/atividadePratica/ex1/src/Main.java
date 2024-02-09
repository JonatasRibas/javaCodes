import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro (maior que o primeiro): ");
        int numero2 = scanner.nextInt();

        if (numero1 >= numero2) {
            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
            System.exit(0);
        }

        System.out.println("Múltiplos de 3 e 5 no intervalo [" + numero1 + ", " + numero2 + "]:");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
