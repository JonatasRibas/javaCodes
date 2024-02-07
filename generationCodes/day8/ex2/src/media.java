import java.util.Scanner;
public class media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("======CALCULADOR DE MÉDIAS====== \n \n");
        System.out.println("NOTA 1: ");
        float nota1 = scanner.nextFloat();

        System.out.println("NOTA 2: ");
        float nota2 = scanner.nextFloat();

        System.out.println("NOTA 3: ");
        float nota3 = scanner.nextFloat();

        System.out.println("NOTA 4: ");
        float nota4 = scanner.nextFloat();

        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("SUA MÉDIA É: "+mediaFinal);

        System.out.println("OBRIGADO!");

    }
}
