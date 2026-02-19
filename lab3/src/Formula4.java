import java.util.Scanner;

public class Formula4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите температуру в Цельсиях: ");
    double C = scanner.nextDouble();

    double F = (9.0 / 5.0) * C + 32;

    System.out.println(C + " °C = " + F + " °F");
  }
}
