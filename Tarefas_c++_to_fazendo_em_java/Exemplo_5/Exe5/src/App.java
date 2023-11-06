import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double area,n = 3.14159,raio = 0;
        Scanner scan = new Scanner(System.in);
while(raio >= 0){
        raio = scan.nextDouble();
        area = n * (raio*raio);
        System.out.printf("A Area é %.4f%n",area);
}
    }
}
