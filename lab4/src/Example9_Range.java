import java.util.Scanner;

public class Example9_Range {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = scanner.nextInt();
		System.out.print("Введите начало диапазона: ");
		int min = scanner.nextInt();
		System.out.print("Введите конец диапазона: ");
		int max = scanner.nextInt();

		if (num >= min && num <= max) {
			System.out.println(num + " попадает в диапазон [" + min + ", " + max + "]");
		} else {
			System.out.println(num + " не попадает в диапазон [" + min + ", " + max + "]");
		}
	}
}
