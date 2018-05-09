import java.util.Scanner;
public class questao3{
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    double n1 = puxe.nextDouble();
    System.out.print("Digite outro: ");
    double n2 = puxe.nextDouble();
    if (n1 <= n2){
      System.out.println("Menor: " + n1);
      System.out.println("Maior: " + n2);
    }else{
    System.out.println("Menor: " + n2);
    System.out.println("Maior: " + n1);
    }
    puxe.close();

	}
}
