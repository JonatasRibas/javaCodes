import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<>();

        System.out.println("Digite 10 valores inteiros não repetidos:");
        for (int i = 0; i < 10; i++) {
            int valor;
            do {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                valor = scanner.nextInt();
            } while (!adicionarSeNaoRepetido(conjunto, valor));
        }
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }

    private static boolean adicionarSeNaoRepetido(Set<Integer> conjunto, int valor) {
        if (conjunto.contains(valor)) {
            System.out.println("Valor repetido. Tente novamente.");
            return false;
        } else {
            conjunto.add(valor);
            return true;
        }
    }
}
