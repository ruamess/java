import java.util.Scanner;

public class Example10_Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		double a = scanner.nextDouble();
		System.out.print("Введите операцию (+, -, *, /): ");
		char op = scanner.next().charAt(0);
		System.out.print("Введите второе число: ");
		double b = scanner.nextDouble();

		double result;
		switch (op) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				if (b == 0) {
					System.out.println("Ошибка: деление на ноль!");
					return;
				}
				result = a / b;
				break;
			default:
				System.out.println("Неизвестная операция: " + op);
				return;
		}

		System.out.println(a + " " + op + " " + b + " = " + result);
	}
}
