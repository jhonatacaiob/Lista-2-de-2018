import java.util.Scanner;
public class questao9{
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite o preço do produto: ");
		double Preco = puxe.nextDouble();
		double NovoPreco;
		if (Preco <= 50) {
			NovoPreco = Preco * 1.05;
		}else if (Preco <= 100) {
			NovoPreco = Preco * 1.1;
		}else {
			NovoPreco = Preco * 1.15;
		}
		System.out.print("Novo preço: ");
		System.out.println(NovoPreco);
		System.out.print("Classificaçao: ");
		if (NovoPreco <= 80) {
			System.out.print("Barato");
		}else if (NovoPreco <= 120) {
			System.out.print("Normal");
		}else if (NovoPreco <= 200) {
			System.out.print("Caro");
		}else {
			System.out.print("Muito caro");
		}
		puxe.close();
	}
}
