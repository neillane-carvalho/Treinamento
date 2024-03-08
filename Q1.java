public class Q1 {

    public static void encontrarMaior(int num1, int num2){
        if (num1>num2){
            System.out.println("o maior número é: " + num1);
        } else if (num2>num1) {
            System.out.println("o maior número é: "+ num2);
        } else {
            System.out.println("os dois números são iguais");
        }
    }

    public static void main (String[] args){
        int primeiroNum = 10;
        int segundoNum = 20;

        encontrarMaior(primeiroNum,segundoNum);
    }
}
