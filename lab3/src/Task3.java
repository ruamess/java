public class Task3 {
  public static void main(String[] args) {
    int x = 5;
    System.out.println("Начальное значение x = " + x);

    x = x + 10;
    System.out.println("После x = x + 10: x = " + x);

    x *= 2;
    System.out.println("После x *= 2: x = " + x);

    x -= 5;
    System.out.println("После x -= 5: x = " + x);

    x /= 3;
    System.out.println("После x /= 3: x = " + x);

    int y = x + 100;
    System.out.println("y = x + 100 = " + y);
  }
}
