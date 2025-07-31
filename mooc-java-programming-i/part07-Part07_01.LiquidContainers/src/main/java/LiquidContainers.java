import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        while (true) {
            // Print state BEFORE each command
            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length < 2) {
                System.out.println("Invalid command.");
                continue;
            }

            String command = parts[0];
            int amount;

            try {
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Amount must be a number.");
                continue;
            }

            if (amount < 0) {
                continue;
            }

            switch (command) {
                case "add":
                    firstVolume += amount;
                    if (firstVolume > maxVolume) {
                        firstVolume = maxVolume;
                    }
                    break;

                case "move":
                    int moveAmount = Math.min(amount, firstVolume);
                    firstVolume -= moveAmount;
                    secondVolume += moveAmount;
                    if (secondVolume > maxVolume) {
                        secondVolume = maxVolume;
                    }
                    break;

                case "remove":
                    secondVolume -= amount;
                    if (secondVolume < 0) {
                        secondVolume = 0;
                    }
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
