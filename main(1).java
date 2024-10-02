import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        char sexo;
        char estdcvl;
        int tmpcsd = 0;


        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        nome = sc.nextLine();
        System.out.println("digite seu sexo");
        System.out.println("F para mulher e H homem");
        sexo = sc.next().charAt(0);
        System.out.println("digite seu estado civil");
        System.out.println("C para casado/casada e S para solteiro/solteira");
        estdcvl = sc.next().charAt(0);
        //verifica se e homem ou mulher e se esta casado/a ou solteira/o
        if (sexo == 'F' && estdcvl == 'C'){
            System.out.println("esta casada a quanto tempo em anos");
            tmpcsd = sc.nextInt();
        }
        System.out.println("seu nome");
        System.out.println(nome);
        System.out.println("seu sexo");
        System.out.println(sexo);
        System.out.println("seu estado civil");
        System.out.println(estdcvl);
        if (tmpcsd != 0) {
            System.out.println("seu tempo de casada");
            System.out.println(tmpcsd + " anos");
        }
        }
}
