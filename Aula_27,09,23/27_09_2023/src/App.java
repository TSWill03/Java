import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int decisao = 0;
do {
            int modulo, modulo_a, bits_modulo = 0, bits_maximo = 0;
            double modulo_arredondado = 0, modulo_divisao =0, bits, calcular_modulo, calcular_contagem_maxima = 0;

            System.out.println("Calcular bits = 1\nCalcular Modulo = 2\nCalcular contagem maxima = 3\nfechar = 4");
            decisao = scan.nextInt();

            if(decisao == 1){

                System.out.println("Coloque o modulo");
                modulo_a = scan.nextInt();
                modulo = modulo_a;
                modulo_divisao = modulo_a;

                while(modulo > 1){
                    modulo = modulo / 2;
                    modulo_divisao = modulo_divisao / 2.0;
                    bits_modulo = bits_modulo + 1;
                }
                if(modulo_divisao > 1){
                    bits_modulo = bits_modulo + 1;
                    modulo_arredondado = Math.pow(2, bits_modulo);
                    System.out.println("O modulo informado não possui bits redondos, " +modulo_arredondado +" será o melhor resulta é terá " + bits_modulo + " bits");
                }
                else{
                    System.out.println("A quantidade de bits para modulo " + modulo_a + " é " + bits_modulo + " bits");
                }
            }
            if(decisao == 2){
                System.out.println("Coloque os bits");
                bits = scan.nextInt();
                calcular_modulo = Math.pow(2, bits);
                System.out.println("O modulo para " + bits + " bits é " + calcular_modulo);
            }
            if(decisao == 3){
                System.out.println("Coloque os bits");
                bits_maximo = scan.nextInt();
                calcular_contagem_maxima = Math.pow(2, bits_maximo)-1;
                System.out.println("A contagem maxima para " + bits_maximo + " é " + calcular_contagem_maxima);
            }
        }
        while(decisao != 4);
        scan.close();
    }
}