import java.util.Scanner;
public class questao12{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.println("Digite as informaçoes sobre o produto");
    System.out.print("Código do produto: ");
    double codigo = puxe.nextDouble();
    System.out.print("Quantidade: ");
    double quantidade = puxe.nextDouble();
    double Preco;
    double PrecoTotal;
    double Desconto;
    double PrecoFinal;
    if (codigo <= 10) {
      Preco =  10;
    }else if (codigo <= 20) {
      Preco = 15;
    }else if (codigo <= 30) {
      Preco = 20;
    }else if (codigo <= 40) {
      Preco = 30;
    }else {
      Preco = 0;
      System.out.print("Codigo Inválido");
    }System.out.println("Preço do produto: R$ " + Preco);
    PrecoTotal = Preco * quantidade;
    System.out.print("Preço da nota: R$ " + PrecoTotal);
    if (PrecoTotal <= 250) {
      Desconto = PrecoTotal * 0.05;
      PrecoFinal = PrecoTotal - Desconto;
    }else if (PrecoTotal <= 500) {
      Desconto = PrecoDesconto * 0.1;
      PrecoFinal = PrecoTotal - Desconto;
    }else {
      Desconto = PrecoDesconto * 0.15;
      PrecoFinal = PrecoTotal - PrecoDesconto;
    }
    System.out.println("Valor do desconto: " + Desconto);
    System.out.println("Preço final: " + PrecoFinal);
    puxe.close();
  }
}
