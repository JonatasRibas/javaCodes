import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float numero1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        float numero2 = scanner.nextFloat();

        System.out.println("Digite o código da operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão): ");
        int codigoOperacao = scanner.nextInt();

        float resultado;
        switch (codigoOperacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }

        scanner.close();
    }
}
