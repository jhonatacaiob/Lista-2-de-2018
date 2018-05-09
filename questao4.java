import java.util.Scanner;
public class questao4{
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    double n1 = puxe.nextDouble();
    System.out.print("Digite outro: ");
    double n2 = puxe.nextDouble();
    System.out.print("Digite mais um: ");
    double n3 = puxe.nextDouble();
    if (n3 >= n2 && n3 >= n1){
			System.out.println("Maior: " + n3);
			if (n2 <= n1){
        System.out.println("Menor: " + n2);
      }else{
      	System.out.println("Menor: " + n1);
      }
    }else if (n1 >= n2 && n1 >= n3){
			System.out.println("Maior: " + n1);
			if(n3 <= n2){
				System.out.println("Menor: " + n3);
			}else{
        System.out.println("Menor: " + n2);
			}
    }else{
			System.out.println("Maior: " + n2);
			if(n3 <= n1){
				System.out.println("Menor: " + n3);
			}else{
				System.out.println("Menor: " + n1);
			}
		}
    puxe.close();

	}
}
