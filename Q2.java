import java.util.Scanner;

public class Q2 {

    public static void compararNum(int num1, int num2){
        if (num1 == num2){
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }

        int maior = Math.max(num1,num2);
        int menor = Math.min(num1, num2);

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNum = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNum = scanner.nextInt();

        compararNum(primeiroNum,segundoNum);

        scanner.close();

    }
}
