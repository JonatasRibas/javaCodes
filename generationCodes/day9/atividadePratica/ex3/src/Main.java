import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do doador: ");
        String nomeDoador = scanner.nextLine();

        System.out.println("Digite a idade do doador: ");
        int idadeDoador = scanner.nextInt();

        System.out.println("É a primeira doação do doador? (true/false): ");
        boolean primeiraDoacao = scanner.nextBoolean();

        if (idadeDoador >= 18 && idadeDoador <= 69) {
            if (idadeDoador >= 60 && idadeDoador <= 69) {
                if (primeiraDoacao) {
                    System.out.println("Desculpe, " + nomeDoador + ". Você não está apto para doar sangue.");
                } else {
                    System.out.println("Parabéns, " + nomeDoador + ". Você está apto para doar sangue.");
                }
            } else {
                System.out.println("Parabéns, " + nomeDoador + ". Você está apto para doar sangue.");
            }
        } else {
            System.out.println("Desculpe, " + nomeDoador + ". Você não está apto para doar sangue.");
        }

    }
}
