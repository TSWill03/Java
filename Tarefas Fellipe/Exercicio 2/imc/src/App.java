import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double peso = 0, altura = 0, imc = 0;

        System.out.println("Qual o seu peso?");
        peso = scan.nextDouble();

        System.out.println("Qual a sua altura?");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        if(imc >= 18.5 && imc < 25){
            System.out.println("Peso Normal");
        }
        if(imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }
        if(imc >= 30 && imc < 35){
            System.out.println("Obesidade Grau 1");
        }
        if(imc >= 35 && imc < 40){
            System.out.println("Obesidade Grau 2");
        }
        if(imc > 40){
            System.out.println("Obesidade Grau 3");
        }
    }
}
