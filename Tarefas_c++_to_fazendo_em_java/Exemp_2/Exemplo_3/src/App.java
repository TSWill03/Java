import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int numeroint;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o numero");
        numeroint = scan.nextInt();

        System.out.printf("N[%d] = 1%n",numeroint);

        for(int i = 2; i < 11; i++){
            numeroint = numeroint *2;
            System.out.printf("N[%d] = %d%n",numeroint,i);
        scan.close();
        }
    }
}

