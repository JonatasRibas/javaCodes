import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float n1, n2, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota 1: ");
        n1 = scanner.nextFloat();

        System.out.println("Nota 2: ");
        n2 = scanner.nextFloat();

        media = (n1 + n2)/2;

        if (media >=6){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reporvado!");
        }
    }
}