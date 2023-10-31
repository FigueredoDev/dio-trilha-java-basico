public class VariableTypes {
    public static void main(String[] args) {
        // Variables
        short shortNumber = 1; 
        int normalNumber = shortNumber;
        // Casting short to int
        short shortNumber2 = (short) normalNumber;
        System.out.println(shortNumber2);

        // byte type
        byte sampleByte = 123;
        System.out.println(sampleByte);

        // short type
        short sampleShort = 12345;
        System.out.println(sampleShort);

        // int type
        int sampleInt = 1234567890;
        System.out.println(sampleInt);

        // long type
        long sampleLong = 123456789012345L; // Notice the 'L' at the end to denote it's a long value
        System.out.println(sampleLong);

        // float type
        float sampleFloat = 123.45f; // Notice the 'f' at the end to denote it's a float value
        System.out.println(sampleFloat);

        // double type
        double sampleDouble = 123.4567890123;
        System.out.println(sampleDouble);

        // char type
        char sampleChar = 'A';
        char sampleCharUnicode = '\u0041'; // Represents the character 'A' using Unicode
        System.out.println(sampleChar);
        System.out.println(sampleCharUnicode);

        // String type
        String sampleString = "Hello World";
        System.out.println(sampleString);
    }
}
