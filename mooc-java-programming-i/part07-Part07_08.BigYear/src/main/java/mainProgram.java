import java.util.HashMap;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Bird> birds = new HashMap<>();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("Quit")) {
                break;

            } else if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();

                birds.put(name, new Bird(name, latin));

            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                Bird bird = birds.get(name);
                if (bird != null) {
                    bird.observe();
                } else {
                    System.out.println("Not a bird!");
                }

            } else if (command.equalsIgnoreCase("All")) {
                for (Bird b : birds.values()) {
                    System.out.println(b);
                }

            } else if (command.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                Bird bird = birds.get(name);
                if (bird != null) {
                    System.out.println(bird);
                } else {
                    System.out.println("Not a bird!");
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
