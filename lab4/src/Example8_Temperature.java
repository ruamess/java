import java.util.Scanner;

public class Example8_Temperature {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите температуру (°C): ");
		double temp = scanner.nextDouble();

		if (temp < 0) {
			System.out.println("Очень холодно (мороз)");
		} else if (temp < 15) {
			System.out.println("Холодно");
		} else if (temp < 25) {
			System.out.println("Тепло");
		} else {
			System.out.println("Жарко");
		}
	}
}
