public class MeasurementSystem {
    public static void main(String[] args) {
        String character = "S";

        switch (character.toLowerCase()) {
            case "s": {
                System.out.println("Small");
                break;
            }
            case "m": {
                System.out.println("Medium");
                break;
            }
            case "l": {
                System.out.println("Large");
                break;
            }
            default:
                System.out.println("Unknown");
        }
    }
}
