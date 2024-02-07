import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Salário Bruto:");
        float salarioBruto = scanner.nextFloat();

        System.out.println("Digite o Adicional Noturno:");
        float adicionalNoturno = scanner.nextFloat();

        System.out.println("Digite as Horas Extras:");
        float horasExtras = scanner.nextFloat();

        System.out.println("Digite os Descontos:");
        float descontos = scanner.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + horasExtras - descontos;

        System.out.println("Salário Líquido: " + salarioLiquido);

        scanner.close();
    }
}
