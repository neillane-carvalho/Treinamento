import java.util.Scanner;

public class Q11 {
    public static String nome;
    public static double av1;
    public static double av2;
    public static double av3;

    public static void lerInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite se nome: ");
        nome = scanner.nextLine();

        System.out.print("Dgite sua nota da Av1: ");
        av1 = scanner.nextDouble();

        System.out.print("Digite sua nota da Av2: ");
        av2 = scanner.nextDouble();

        System.out.print("Digite sua nota da Av3: ");
        av3 = scanner.nextDouble();

        scanner.close();
    }

    public static double mediaAluno (){
        return (av1+av2+av3)/3;
    }


    public static void print(){
        System.out.printf("Média de " + nome + ":");
        System.out.printf("Nota " + mediaAluno());
    }

    public static void main (String[] args){
        lerInfo();


        print();


    }
}
