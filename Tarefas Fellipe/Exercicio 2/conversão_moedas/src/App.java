import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double real = 0, resultado = 0;
        int decisao = 0;

        System.out.println("Deseja converter para:\nDolar = 1\nEuro = 2\nLibra = 3\nPeso Argentino = 4");
        decisao = scan.nextInt();

        System.out.println("Coloque a quantida que deseja converter");
        real = scan.nextDouble();

        if (decisao == 1) {
            resultado = real / 3.86;
            System.out.printf("Com %.2f você terá %.2f Dolares", real, resultado);
        }
        if (decisao == 2) {
            resultado = real / 4.34;
            System.out.printf("Com %.2f você terá %.2f Euros", real, resultado);
        }
        if (decisao == 3) {
            resultado = real / 5.04;
            System.out.printf("Com %.2f você terá %.2f Libras", real, resultado);
        }
        if (decisao == 4) {
            resultado = real / 0.09;
            System.out.printf("Com %.2f você terá %.2f Pesos Argentinos", real, resultado);
        }
    }
}