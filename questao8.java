import java.util.Scanner;
public class questao8{
  public static void main(String[] args){
    Scanner puxe = new Scanner(System.in);

    System.out.print("Digite o seu saldo medio: ");

    double SaldoMedio = puxe.nextDouble();

    double credito;

    System.out.println("Saldo medio: " + SaldoMedio);

    if (SaldoMedio > 400 ){

      credito = 0.3 * SaldoMedio;

    }else if (SaldoMedio > 300) {

      credito = 0.25 * SaldoMedio;

    }else if (SaldoMedio > 200) {

      credito = 0.2 * SaldoMedio;

    }else{

      credito = 0.1 * SaldoMedio;
    }

    System.out.print("Credito: " + credito);

    puxe.close();
  }
}
