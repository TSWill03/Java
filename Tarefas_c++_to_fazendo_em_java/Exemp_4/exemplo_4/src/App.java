import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int alcool = 0,gasolina = 0,diesel = 0,decisor = 0;
        Scanner scan = new Scanner(System.in);

        while(decisor != 4){
            System.out.println("PROXIMO!!");
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
        }
        System.out.printf("Muito Obrigado!!%nAlcool: %d%nGasolina: %d%nDiesel: %d%n",alcool,gasolina,diesel);


    }
}
