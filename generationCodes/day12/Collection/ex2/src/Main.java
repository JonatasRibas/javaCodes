import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        System.out.println("List:");
        System.out.println(lista);

        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numero = scanner.nextInt();

        if (lista.contains(numero)) {
            System.out.println("\nO número " + numero + " está localizado na posição: " + lista.indexOf(numero));
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }

        scanner.close();
    }
}
