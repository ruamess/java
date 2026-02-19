import java.util.Scanner;

public class Formula3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите радиус круга r: ");
    double r = scanner.nextDouble();

    double pi = 3.14;
    double S = pi * r * r;

    System.out.println("Площадь круга S = " + S);
  }
}
