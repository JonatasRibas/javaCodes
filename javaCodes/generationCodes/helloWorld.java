package generationCodes;
import java.util.Scanner;
public class helloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");

        String name = scanner.nextLine();


        scanner.close();

        System.out.println("HELLO WORLD, ESSA É A PRIMEIRA APLICAÇÃO DO: " + name);
    }
}
