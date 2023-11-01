import java.util.Arrays;

public class Students {
    public static void main(String[] args) {
        String[] students = { "John", "Maria", "Pedro", "Ana" };

        System.out.println("Traditional for loop:  ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\n For each loop:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("\n Stream loop:");
        Arrays.stream(students).forEach(student -> System.out.println(student));
    }
}
