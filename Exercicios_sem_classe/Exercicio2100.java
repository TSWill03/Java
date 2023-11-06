import javax.swing.JOptionPane; 
public class Exercicio2100 { 

   public static void main(String args []) { 
      double dpeso, daltura, dimc; 
      String speso, saltura, sout; 
      speso=JOptionPane.showInputDialog ( "Peso em Kg" );

      try{
         dpeso=Double.parseDouble( speso );
      }catch(NumberFormatException nfe){ 
          nfe.printStackTrace(System.out);
          dpeso = 70.0;
      }

      saltura=JOptionPane.showInputDialog ( "Altura em metros" );

      try{
         daltura=Double.parseDouble( saltura ); 
      }catch(NumberFormatException nfe){ 
          nfe.printStackTrace(System.out);
          daltura = 1.7;
      }

      dimc=dpeso/(daltura*daltura); 
      sout="sua massa corporal é " + dimc; 
      JOptionPane.showMessageDialog( null, sout, "saida", JOptionPane.INFORMATION_MESSAGE ); 
      System.exit(0); 
    } 
}