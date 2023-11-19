import java.time.LocalTime;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void learn() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);
    }
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.learn();
    }
}
