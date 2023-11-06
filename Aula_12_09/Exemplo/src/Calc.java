import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = 0;

        System.out.println("Digite um numero:");
        a = scan.nextInt();

//par ou não, positivo negativo
        if(a%2 == 0){
            if(a >= 0){
                System.out.println("Ele e par e Positivo");
            }
            if(a < 0){
                System.out.println("Ele e par e negativo");
            }
        }
        if(a % 2 != 0){
            if(a >= 0){
                System.out.println("Ele e impar e Positivo");
            }
            if(a < 0){
                System.out.println("Ele e impar e negativo");
            }
        }
}
}
