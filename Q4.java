import java.util.Scanner;

public class Q4 {

    public static void escolherOperacao (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primeiroNum = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundoNum = scanner.nextDouble();

        System.out.println("Escolha a operação(+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        switch (operacao){
            case '+':
                resultado = primeiroNum + segundoNum;
                break;
            case '-':
                resultado = primeiroNum - segundoNum;
                break;
            case '*':
                resultado = primeiroNum * segundoNum;
                break;
            case '/':
                if (segundoNum != 0){
                    resultado = primeiroNum/segundoNum;

                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado da operação é " + resultado);

        scanner.close();
    }

    public static void main (String[] args){
        escolherOperacao();
    }
}
