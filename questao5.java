import java.util.Scanner;

public class questao5 {
public static void main(String[] args) {
	System.out.println("Digite dois numeros");
	Scanner puxe = new Scanner(System.in);
	System.out.print("Numero 1: ");
	int n1 = puxe.nextInt();
	System.out.print("Numero 2: ");
	int n2 = puxe.nextInt();
	System.out.println("O que você deseja fazer?");
	System.out.println("1. Média entre os números digitados");
	System.out.println("2. Diferença do maior pelo menor");
	System.out.println("3. Produto entre os números digitados");
	System.out.println("4. Divisão do primeiro pelo segundo");
	System.out.println("5. O primeiro número elevado ao segundo número");
	System.out.println("6. Raiz quadrada de cada um dos números");
	System.out.println("7. Raiz cúbica de cada um dos números");
	int op = puxe.nextInt();
	switch (op){
	case 1:
		System.out.println((n1+n2)/2);
		break;
	case 2:
		if (n1 > n2){
			System.out.print(n1-n2);
		}else{
			System.out.println(n2-n1);
		}
		break;
	case 3:
		System.out.println(n1*n2);
		break;
	case 4:
		System.out.println((double) n1 / n2);
		break;
	case 5:
		System.out.println(Math.pow(n1, n2));
		break;
	case 6:
		System.out.println(Math.sqrt(n1));
		System.out.println(Math.sqrt(n2));
		break;
	case 7:
		System.out.println(Math.cbrt(n1));
		System.out.println(Math.cbrt(n2));
		break;
	default:
		System.out.println("Opção Invalida");
		break;
	}
	puxe.close();
	}
}
