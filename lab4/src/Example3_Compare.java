import java.util.Scanner;

public class Example3_Compare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		double a = scanner.nextDouble();
		System.out.print("Введите второе число: ");
		double b = scanner.nextDouble();

		if (a > b) {
			System.out.println(a + " больше " + b);
		} else if (a < b) {
			System.out.println(b + " больше " + a);
		} else {
			System.out.println("Числа равны");
		}
	}
}
