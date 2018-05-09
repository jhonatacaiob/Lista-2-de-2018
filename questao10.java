import java.util.Scanner;
public class questao10{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);

    System.out.print("Digite sua altura: ");

    double altura = puxe.nextDouble();

    System.out.println("Digite seu sexo");

    System.out.println("M. para Masculino");

    System.out.println("F.. para feminino");

    char sexo = puxe.next().charAt(0);

    double PesoIdeal;

    if (sexo == 'm' || sexo == 'M') {

      PesoIdeal =  (altura * 71.7) - 58;

    }else if (sexo == 'f' || sexo == 'F') {

      PesoIdeal = (altura * 62.1 ) - 44.7;

    }else{

      System.out.println("Opção Invalida");

    }
    System.out.print("Peso ideal: " + PesoIdeal);

    puxe.close();
  }
}
