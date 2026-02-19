import java.util.Scanner;

public class Formula2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите длину a: ");
    double a = scanner.nextDouble();

    System.out.print("Введите ширину b: ");
    double b = scanner.nextDouble();

    double S = a * b;
    double P = 2 * (a + b);

    System.out.println("Площадь S = " + S);
    System.out.println("Периметр P = " + P);
  }
}
