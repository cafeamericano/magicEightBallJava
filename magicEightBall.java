import java.util.Random;

public class MyClass {

    static void findIndexOf(String context, String character) {
        int location = context.indexOf(character);
        System.out.println(location);
    }

    public static void main(String[] args) {
        findIndexOf("Banana", "x");
    }
}