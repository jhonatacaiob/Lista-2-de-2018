import java.util.Scanner;
public class questao6{
  public static void main(String[] args){
    Scanner puxe = new Scanner(System.in);
      System.out.print("Digite quanto você ganha: ");

      double Salario = puxe.nextDouble();

      double SalarioReajustado;

      if (Salario < 500){

	  SalarioReajustado = Salario * 1.3;

          System.out.print("Seu salario ajustado vale: " + SalarioReajustado );

      }else{

          System.out.print("Seu salário não sofreu reajuste!");

      }
    puxe.close();
  }
}
