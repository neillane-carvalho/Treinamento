import java.util.Scanner;

public class Q3 {
    public static void mult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primeiroNum = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundoNum = scanner.nextDouble();

        double resultado = primeiroNum*segundoNum;

        System.out.println("O resultado da multiplicação é " + resultado);

        scanner.close();

    }

    public static void main (String[] args){

        mult();
    }
}
