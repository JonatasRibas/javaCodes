import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor (n1):");
        float n1 = scanner.nextFloat();

        System.out.println("Digite o segundo valor (n2):");
        float n2 = scanner.nextFloat();

        System.out.println("Digite o terceiro valor (n3):");
        float n3 = scanner.nextFloat();

        System.out.println("Digite o quarto valor (n4):");
        float n4 = scanner.nextFloat();


        float diferenca = (n1*n2) - (n3*n4);

        System.out.println("Diferença do produto entre n1 e n2 pelo produto entre n3 e n4: " + diferenca);

        scanner.close();
    }
}
