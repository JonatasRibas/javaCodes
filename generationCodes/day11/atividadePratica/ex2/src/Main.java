import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        System.out.println("\nElementos nos índices ímpares:");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nElementos pares:");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nSoma: " + soma);

        double media = (double) soma / 10;

        System.out.printf("\nMédia: %.2f\n", media);

        scanner.close();
    }
}
