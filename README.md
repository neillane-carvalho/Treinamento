(https://drive.google.com/file/d/14_cjSi9dep38B7pq7DJ8WkTa5iTbkqYs/view?usp=classroom_web&authuser=0)https://drive.google.com/file/d/14_cjSi9dep38B7pq7DJ8WkTa5iTbkqYs/view?usp=classroom_web&authuser=0

Q10
public class Q10 {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Números primos de 1 até 50:");
        for (int i = 1; i <= 50; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}

Q11
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
        //chamar metodos
        print();


    }

