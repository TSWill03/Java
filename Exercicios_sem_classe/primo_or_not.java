
import java.util.Scanner;

public class primo_or_not {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean terminar = false;

        do {
            int num_rece = 0, ultimo_digito = 0;

            System.out.println("Digite um número maior que zero:");
            num_rece = scan.nextInt();

            if (num_rece <= 0) {
                System.out.println("Número precisa ser maior que zero.\n");
            } else if (num_rece == 1 || num_rece == 2) {
                System.out.printf("O número %d é primo.\n\n", num_rece);
            } else {
                ultimo_digito = num_rece % 10;
                if (ultimo_digito % 2 == 0) {
                    System.out.printf("O número %d não é primo.\n\n", num_rece);
                } else {
                    boolean primo = true;
                    for (int i = 2; i <= Math.sqrt(num_rece); i++) {
                        if (num_rece % i == 0) {
                            primo = false;
                            break;
                        }
                    }
                    if (primo) {
                        System.out.printf("O número %d é primo.\n\n", num_rece);
                    } else {
                        System.out.printf("O número %d não é primo.\n\n", num_rece);
                    }
                }
            }

            System.out.println("Deseja verificar outro número? (S/N)");
            String opcao = scan.next();
            if (opcao.equalsIgnoreCase("N")) {
                terminar = true;
            }
        } while (!terminar);

        scan.close();
    }
}
