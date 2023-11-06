import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
//Declaração de variaveis

        int idade = 0;
        boolean maior_Idade = false;
//Entrada de Dados

        System.out.println(("Qual a Idade?"));
        idade = scan.nextInt();
//processamento

if(idade >= 18){
    maior_Idade = true;
}
else{
    maior_Idade = false;
}

//Saida de Dados

if(maior_Idade == true){
    System.out.println("Maior de Idade");
}
else{
    System.out.println("Menor de Idade");
}
    }
}
