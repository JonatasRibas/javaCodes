import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            conjunto.add(i);
        }

        System.out.println("List:");
        System.out.println(conjunto);

        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numero = scanner.nextInt();

        if (conjunto.contains(numero)) {
            System.out.println("\nO número " + numero + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        scanner.close();
    }
}
