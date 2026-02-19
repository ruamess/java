public class Task2 {
  public static void main(String[] args) {
    double x = 15.0;
    double y = 4.0;

    double sum = x + y;
    double diff = x - y;
    double product = x * y;
    double quotient = x / y;
    double remainder = x % y;

    System.out.println("x = " + x + ", y = " + y);
    System.out.println("Сложение: x + y = " + sum);
    System.out.println("Вычитание: x - y = " + diff);
    System.out.println("Умножение: x * y = " + product);
    System.out.println("Деление: x / y = " + quotient);
    System.out.println("Остаток: x % y = " + remainder);
  }
}
