public class questao13 {
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.println("Digite os dados do produto");
    System.out.print("Preço: ");
    double preco = puxe.nextDouble();
    System.out.print("Categoria:
    \n 1. para Limpeza
    \n 2 para Alimentação
    \n 3. para Vestuário
    \n : ");
    int categoria = puxe.nextInt();
    System.out.print("Situação (R ou S): ");
    char situacao = puxe.next().charAt(0);
    double ValorAumento;
    double imposto;
    if (preco <= 25){
      if (categoria == 1) {
        ValorAumento = 0.05 * preco;
      }else if (categoria == 2) {
        ValorAumento = 0.08 * preco;
      }else if (categoria == 3) {
        ValorAumento = 0.1 * preco;
      }else{
        ValorAumento = 0 * preco;
      }
    }else{
      if (categoria == 1){
        ValorAumento = 0.12 * preco;
      }else if (categoria == 2) {
        ValorAumento = 0.15 * preco;
      }else {
        ValorAumento = 0.18 * preco;
      }
    }System.out.println("Valor do aumento do preço: " + ValorAumento);
    if (categoria == 2 || situacao == 'r' || situacao == 'R') {
      imposto = 0.05 * preco;
    }else {
      imposto = 0.08 * preco;
    }
    System.out.println("Valor do imposto: " + imposto);
    double PrecoNovo = imposto + preco + ValorAumento;
    System.out.println("Preço novo do produto: " + PrecoNovo);
    String classifica;
    if (PrecoNovo <= 50) {
      classifica = "Barato";
    }else if ( PrecoNovo < 120 ) {
      classifica = "Normal";
    }else {
      classifica = "Caro";
    }
    System.out.println("Classificação: " + classifica);
    puxe.close();
  }
}
