import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do colaborador:");
        String nome = scanner.nextLine();

        System.out.println("Informe o código do cargo (1 a 6):");
        int codigoCargo = scanner.nextInt();

        System.out.println("Informe o salário:");
        float salario = scanner.nextFloat();

        float percentualReajuste = 0;
        String cargo = "";

        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                percentualReajuste = 0.1f;
                break;
            case 2:
                cargo = "Vendedor";
                percentualReajuste = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentualReajuste = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentualReajuste = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentualReajuste = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentualReajuste = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido.");
                System.exit(1);
        }

        float novoSalario = salario + (percentualReajuste * salario);

        System.out.println("Nome do Colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Novo Salário: " + novoSalario);

        scanner.close();
    }
}
