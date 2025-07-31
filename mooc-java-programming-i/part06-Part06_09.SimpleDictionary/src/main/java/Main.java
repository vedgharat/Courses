
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "yksi");
        book.add("two", "kaksi");
        System.out.println(book.translate("one"));

        System.out.println(book.translate("two"));
        System.out.println(book.translate("three"));
    }
}
