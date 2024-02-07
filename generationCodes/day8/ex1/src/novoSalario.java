import java.util.Scanner;

public  class novoSalario {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        float salario = leitura.nextFloat();

        System.out.println("Digite o abono: ");
        float abono = leitura.nextFloat();

        System.out.println("======RESULTADO======: \n \n ");

        System.out.println("O seu salário é: "+salario);
        System.out.println("O Abono foi de: "+abono);

        float novoSalario = salario + abono;

        System.out.println("O novo salário é: R$" +novoSalario);
    }
}