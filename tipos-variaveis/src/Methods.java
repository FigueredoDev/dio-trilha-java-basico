public class Methods {
    public static void main(String[] args) {
        String name = "Jhonata Figueredo";

        printName(name);

        int result = sum(10, 20);
        System.out.println(result);
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
