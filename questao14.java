import java.util.Scanner;
public class questao14{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.println("Digite 3 numeros inteiros");
    System.out.print("1°: ");
    int n1 = puxe.nextInt();
    System.out.print("2°: ");
    int n2 = puxe.nextInt();
    System.out.print("3°: ");
    int n3 = puxe.nextInt();
    if (n3 >= n2 && n3 >= n1) {
      System.out.println(n3);
      if (n2 >= n1) {
        System.out.println(n2);
        System.out.println(n1);
      }else {
        System.out.println(n1);
        System.out.println(n2);
      }
    }else if (n1 >= n2 && n1 >= n3) {
      System.out.println(n1);
      if (n2 >= n3) {
        System.out.println(n2);
        System.out.println(n1);
      }else {
        System.out.println(n1);
        System.out.println(n2);
    }else {
      System.out.println(n2);
      if (n1 >= n3) {
        System.out.println(n1);
        System.out.println(n3);
      }else {
        System.out.println(n3);
        System.out.println(n1);
      }
    }
  }
}
