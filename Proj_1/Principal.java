package Proj_1;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
    //começa o codigo e abre uma interface de digitação para o usuario
    Scanner entradaDados = new Scanner(System.in);
    //coloca na tela o que é para ser feito, no caso digitar um número inteiro
    System.out.print("Digite um número inteiro ");
    //guarda o valor entradaDados dentro da variavel numint
    int numint = entradaDados.nextInt();
    //fecha a entrada de dados para o codigo prosseguir
    entradaDados.close();

    //Cria a variavel numeroBinario
    String numeroBinario = "";

    //esquema de repetição quando não se sabe quantas vezes ira se repetir
    while (numint > 0) {
        //cria a variavel resto
        int resto = numint % 2;
        //Coloca a str na variavel numero binario
        numeroBinario = resto + numeroBinario;
        //faz a divisão do numint por 2
        numint /= 2;

    }
    //mostra o resultado da transformação de decimal para binario
    System.out.println("O número binario e " + numeroBinario);
    }
}