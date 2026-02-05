public class Task5 {
  public static void main(String[] args) {

    Person ref = new Student(); // ссылка базового класса, объект производного
    ref.name = "Роман";
    ref.age = 19;

    // Вызовется Student.displayInfo() из-за полиморфизма
    ref.displayInfo();

    // Чтобы установить group, нужно привести тип (и проверить instanceof)
    if (ref instanceof Student) {
      ((Student) ref).group = "МО-2102";
      System.out.println("\nПосле установки group:");
      ref.displayInfo();
    }
  }
}
