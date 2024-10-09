import java.util.Scanner;
public class main {
    public static void main(String[] args){
    double a , b , c , delta;
    Scanner sc = new Scanner(System.in);
    System.out.println("para calcular baskara digite tres valores inteiros");
    a = sc.nextInt();
    if (a != 0 ){
        b = sc.nextInt();
        c = sc.nextInt();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0){
        System.out.println("existe duas raizes para esses valores apresentados");
        }else if(delta < 0){
            System.out.println("nao a raizes reais para esses valores apresentados");
        }else{
            System.out.println("existe uma raiz para esses valores apresentados");
        };
    };

    }

}
