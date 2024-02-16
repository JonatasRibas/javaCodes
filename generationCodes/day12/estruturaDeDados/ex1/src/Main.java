import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Sair do programa");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println("\nFila:");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nCliente Adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Clientes na Fila:");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) {
                        String clienteChamado = fila.poll();
                        System.out.println("\nFila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        System.out.println("\n" + clienteChamado + " foi Chamado!");
                    } else {
                        System.out.println("\nA Fila está vazia!");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
