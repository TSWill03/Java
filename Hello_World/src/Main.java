import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Segundos?");
        int segundos = scan.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segs = segundos % 60;

        System.out.printf("%d:%02d:%02d\n", horas, minutos, segs);
    }
}