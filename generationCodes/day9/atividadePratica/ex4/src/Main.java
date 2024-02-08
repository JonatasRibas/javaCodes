import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("vertebrado ou invertebrado? ");
        String escolha1 = scanner.nextLine();

        if (Objects.equals(escolha1, "vertebrado")) {

            System.out.println("ave ou mamifero? ");
            String escolha2V = scanner.nextLine();

            if (Objects.equals(escolha2V, "ave")) {

                System.out.println("carnivoro ou onivoro? ");
                String escolhaAve = scanner.nextLine();

                if (Objects.equals(escolhaAve, "carnivoro")) {

                    System.out.println("Animal escolhido: Águia!");
                } else {
                    System.out.println("Animal escolhido: Pomba!");
                }
            } else {

                System.out.println("herbivoro ou onivoro? ");
                String escolhaMamifero = scanner.nextLine();

                if (Objects.equals(escolhaMamifero, "herbivoro")) {

                    System.out.println("Animal escolhido: Vaca!");
                } else {
                    System.out.println("Animal escolhido: Homem!");
                }
            }


        } else {

            System.out.println("inseto ou anelideo? ");
            String escolha2I = scanner.nextLine();

            if (Objects.equals(escolha2I, "inseto")) {

                System.out.println("hematofago ou herbivoro? ");
                String escolhaInseto = scanner.nextLine();

                if (Objects.equals(escolhaInseto, "herbivoro")) {

                    System.out.println("Animal escolhido: Lagarta!");
                } else {
                    System.out.println("Animal escolhido: Pulga!");
                }
            } else {

                System.out.println("hematofago ou onivoro? ");
                String escolhaAnelideo = scanner.nextLine();

                if (Objects.equals(escolhaAnelideo, "onivoro")) {

                    System.out.println("Animal escolhido: Minhoca!");
                } else {
                    System.out.println("Animal escolhido: Sanguessuga!");
                }
            }
        }
    }
}