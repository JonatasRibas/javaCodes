import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário:");
        float salario = scanner.nextFloat();

        System.out.println("Digite o abono:");
        float abono = scanner.nextFloat();

        float novoSalario = salario + abono;

        System.out.println("Novo Salário: " + novoSalario);


    }
}