import java.util.Scanner;
public class questao2{
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		double nota1 = puxe.nextDouble();
		System.out.print("Digite a nota 2: ");
		double nota2 = puxe.nextDouble();
		System.out.print("Digite a nota 3: ");
		double nota3 = puxe.nextDouble();
		System.out.print("Digite a nota 4: ");
		double nota4 = puxe.nextDouble();
		double media = (nota1+nota2+nota3+nota4)/4;
		if (media >= 7){
				System.out.println("Você está aprovado!!");
		}else if (media < 4){
			System.out.println("Você está reprovado!!");
		}else{
      System.out.println("Você está na prova final!!");
    }
		puxe.close();
	}
}
