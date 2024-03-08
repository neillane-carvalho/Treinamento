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
