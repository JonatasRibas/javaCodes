import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<>();

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("Livro adicionado!\n");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!\n");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!\n");
                    } else {
                        String livroRemovido = pilhaLivros.pop();
                        System.out.println("Um livro foi retirado da pilha: " + livroRemovido + "\n");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.\n");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1: Adicionar um novo livro na pilha.");
        System.out.println("2: Listar todos os livros da pilha.");
        System.out.println("3: Retirar um livro da pilha.");
        System.out.println("0: Finalizar o programa.");
        System.out.println("Digite uma opção: ");
    }
}
