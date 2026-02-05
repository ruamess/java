public class Task4 {
  public static void main(String[] args) {

    Student student = new Student();
    student.name = "Иван"; // унаследовано от Person
    student.age = 20; // унаследовано от Person
    student.group = "ИС-2204"; // поле Student

    student.displayInfo();
  }
}
