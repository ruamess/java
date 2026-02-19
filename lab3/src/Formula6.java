import java.util.Scanner;

public class Formula6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите число x: ");
    double x = scanner.nextDouble();

    double square = x * x;
    double cube = x * x * x;

    System.out.println("x² = " + square);
    System.out.println("x³ = " + cube);
  }
}
