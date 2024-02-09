import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMenorQue21 = 0;
        int totalMaiorQue50 = 0;

        while (true) {
            System.out.println("Digite a idade da pessoa (ou um número negativo para sair): ");
            int idade = scanner.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                totalMenorQue21++;
            } else if (idade > 50) {
                totalMaiorQue50++;
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenorQue21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaiorQue50);

        scanner.close();
    }
}
