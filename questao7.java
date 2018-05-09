import java.util.Scanner;
public class questao7{
  public static void main(String[] args){
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite seu salário: ");
    double Salario = puxe.nextDouble();
    double SalarioReajustado;
    if (Salario <= 300){
      SalarioReajustado = Salario * 1.35;
      System.out.print("Salario reajustado " + SalarioReajustado);
    }else{
      SalarioReajustado = Salario * 1.15;
      System.out.print("Salario reajustado " + SalarioReajustado);
    }
    puxe.close();
  }
}
