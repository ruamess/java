import java.util.Scanner;

public class Formula1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите первое число a: ");
    double a = scanner.nextDouble();

    System.out.print("Введите второе число b: ");
    double b = scanner.nextDouble();

    double S = a + b;
    double M = (a + b) / 2;

    System.out.println("Сумма S = " + S);
    System.out.println("Среднее арифметическое M = " + M);
  }
}
