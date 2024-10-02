import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int num1, num2, num3;
        String resposta = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos ver se a soma do primeiro e segundo numero e menor do que o terceiro");
        System.out.println("Digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero");
        num3 = sc.nextInt();

        // verifica se a soma dos valores 1 e 2 e menor que o valor 3
        if (resultado(num1, num2) <= num3) {
            resposta = "o terceiro numero nao e menor que a soma";
        } else if (resultado(num1, num2) > num3) {
            resposta = "o terceiro numero e menor que a soma";
        }
        System.out.println(resposta);
    }

    /**
     * Essa função soma o primeiro valor e o segundo valor
     * @param number1 primeiro valor inteiro
     * @param number2 primeiro valor inteiro
     * @return retorna a soma dos valores inteiros , retorna um inteiro
     */
    public static int resultado(int number1,int number2) {
        return number1 + number2;
    }
}