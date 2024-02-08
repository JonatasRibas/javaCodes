import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Nota 1: ");
        nota1 = scanner.nextFloat();

        System.out.println("Nota 2: ");
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2)/2;

        if (media >= 6){
            System.out.println("Aprovado");
        } else if (media == 5){
            System.out.println("Exame!");
        } else{
            System.out.println("Reprovado!");
        }

    }
}