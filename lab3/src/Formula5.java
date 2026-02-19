import java.util.Scanner;

public class Formula5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите скорость (км/ч): ");
    double v = scanner.nextDouble();

    System.out.print("Введите время (ч): ");
    double t = scanner.nextDouble();

    double S = v * t;

    System.out.println("Расстояние S = " + S + " км");
  }
}
