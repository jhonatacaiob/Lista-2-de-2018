import java.util.Scanner;
public class questao11{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);

    System.out.print("Digite o codigo de origem do produto: ");

    int codigo = puxe.nextInt();

    String origem = "";

    if (codigo == 1) {

      origem = "Sul";

    }else if (codigo == 2) {

      origem = "Norte";

    }else if (codigo == 3) {

      origem = "Leste";

    }else if (codigo == 4) {

      origem = "Oeste";

    }else if (codigo == 7 || codigo == 8 || codigo == 9) {

      origem = "Sudeste";

    }else if (codigo == 5 || codigo == 6) {

      origem = "Nordeste";

    }else if (codigo < 20) {

      origem = "Centro - Oeste";

    }else if (codigo < 30) {

      origem = "Nordeste";

    }else{

      System.out.print("Opção Inválida");

      origem = "Invalida"
    }
    System.out.print("Procedêcia: " + origem);

    puxe.close();

  }
}
s