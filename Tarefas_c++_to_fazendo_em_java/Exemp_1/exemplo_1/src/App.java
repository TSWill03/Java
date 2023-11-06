import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        float nota_1,nota_2,nota_3,nota_4,media,exame,media_apos_exame;

        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque a nota 1");
        nota_1 = scan.nextFloat();
        System.out.println("Coloque a nota 2");
        nota_2 = scan.nextFloat();
        System.out.println("Coloque a nota 3");
        nota_3 = scan.nextFloat();
        System.out.println("Coloque a nota 4");
        nota_4 = scan.nextFloat();

        media = ((nota_1*2)+(nota_2*3)+(nota_3*4)+nota_4)/10;

        if(media<5){
            System.out.println("Aluno Reprovado\n");
        }
        else if(media >= 5 && media < 7){
            System.out.println("\nAluno em Exame\n");
            System.out.println("Qual a nota do exame");
            exame = scan.nextFloat();

            media_apos_exame = (media + exame) /2;
            if(media_apos_exame >= 5){
                System.out.println("Aluno Aprovado");
            }
            else{
                System.out.println("Aluno Reprovado");
            }
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }
}
