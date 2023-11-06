import java.util.Scanner;
public class Problema_4 {
    public static void main(String args) {
        int alcool = 0,gasolina = 0,diesel = 0,decisor = 0;
        Scanner scan = new Scanner(System.in);

        while(decisor != 4){
            decisor = scan.nextInt();
            if(decisor == 1){
                alcool = alcool + 1;
            }
            if(decisor == 2){
                gasolina = gasolina + 1;
            }
            if(decisor == 3){
                diesel = diesel + 1;
            }
        System.out.printf("Alcool = %d%nGasolina = %d%nDiesel = %d%n",alcool,gasolina,diesel);

        }
    }
}
