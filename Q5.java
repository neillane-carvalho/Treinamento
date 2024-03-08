import java.util.Scanner;

public class Q5 {

    public static void calcularEstoqueMedio(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do produto? ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Qual a quantidade máxima? ");
        int valorMax = scanner.nextInt();

        System.out.println("Qual a quantidade mínima? ");
        int valorMin = scanner.nextInt();

        double media = (valorMax + valorMin) / 2;

        System.out.println("O estoque médio do produto " + nomeProduto + " é de " + media);

        scanner.close();
    }

    public static void main (String[] args){
        calcularEstoqueMedio();
    }
}
