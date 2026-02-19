public class Task6_MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Таблица умножения от 1 до 5:");
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%2d x %2d = %2d\t", i, j, i * j);
			}
			System.out.println();
		}
	}
}
