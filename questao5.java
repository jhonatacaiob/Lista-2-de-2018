import java.util.Scanner;

public class questao5 {
public static void main(String[] args) {
	System.out.println("Digite dois numeros");
	Scanner puxe = new Scanner(System.in);
	System.out.print("Numero 1: ");
	int n1 = puxe.nextInt();
	System.out.print("Numero 2: ");
	int n2 = puxe.nextInt();
	System.out.println("O que voc� deseja fazer?");
	System.out.println("1. M�dia entre os n�meros digitados");
	System.out.println("2. Diferen�a do maior pelo menor");
	System.out.println("3. Produto entre os n�meros digitados");
	System.out.println("4. Divis�o do primeiro pelo segundo");
	System.out.println("5. O primeiro n�mero elevado ao segundo n�mero");
	System.out.println("6. Raiz quadrada de cada um dos n�meros");
	System.out.println("7. Raiz c�bica de cada um dos n�meros");
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
		System.out.println("Op��o Invalida");
		break;
	}
	puxe.close();
	}
}
