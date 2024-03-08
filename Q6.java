import java.util.Scanner;

public class Q6 {

    public static void calcularPesoIdeal() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            scanner.close();
            return;
        }

        System.out.println("O peso ideal para " + nome + " é: " + pesoIdeal + " kg");

        scanner.close();
    }

    public static void main(String[] args) {
        calcularPesoIdeal();
    }
    }


