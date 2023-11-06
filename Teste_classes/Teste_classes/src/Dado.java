import java.util.Random;
import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        int valor_dado = 0,resultado_dado, qual_dado;
        Sistema_Principal dado_1 = new Sistema_Principal();

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        qual_dado = scan.nextInt();
        resultado_dado = random.nextInt(qual_dado);



        dado_1.setDado(resultado_dado);
    }
}
