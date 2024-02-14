import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + ": " + vetor[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numeroProcurado = scanner.nextInt();

        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroProcurado) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("Não foi encontrado!");
        }
    }
}
