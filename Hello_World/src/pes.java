import java.util.Scanner;

public class pes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ft = 30.48, R = 0;

        System.out.print("R = ");

        R = scan.nextInt();
        R = ft * R;


        System.out.printf("%.2f %n", R);;

}
}
