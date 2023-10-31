public class Operators {
    public static void main(String[] args) {
        // Concatenation of two strings
        String firstName = "Jhonata";
        String lastName = "Figueredo";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // arithmetic operators
        int a = 10;
        int b = 5;

        // addition, subtraction, multiplication, division, and modulus
        System.out.println("A + B: " + (a + b));
        System.out.println("A - B: " + (a - b));
        System.out.println("A * B: " + (a * b));
        System.out.println("A / B: " + (a / b));
        System.out.println("A % B: " + (a % b));

        // increment and decrement
        int c = 5;
        int d = 10;
        System.out.println("Increment operator: " + c++);
        System.out.println("This is c: " + c);
        System.out.println("Decrement operator: " + c--);
        System.out.println("This is c: " + c);

        System.out.println("Increment operator: " + d++);
        System.out.println("This is d: " + d);
        System.out.println("Decrement operator: " + d--);
        System.out.println("This is d: " + d);

        // Ternary operator
        int x, y;
        x = 5;
        y = 10;

        int result = x > y ? x : y;
        System.out.println("The result is: " + result);

        // Relational operators
        System.out.println("X == Y: " + (x == y));
        System.out.println("X != Y: " + (x != y));
        System.out.println("X > Y: " + (x > y));
        System.out.println("X < Y: " + (x < y));
        System.out.println("X >= Y: " + (x >= y));
        System.out.println("X <= Y: " + (x <= y));

        // Logical operators
        System.out.println("X > 0 && Y > 0: " + (x > 0 && y > 0));
        System.out.println("X > 0 || Y > 0: " + (x > 0 || y > 0));
    }
}
