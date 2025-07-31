import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = new ArrayList<>();

        // Reading the file
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                int time = Integer.parseInt(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                recipes.add(new Recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // UI
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    System.out.println(r);
                }

            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine().toLowerCase();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getName().toLowerCase().contains(word)) {
                        System.out.println(r);
                    }
                }

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.parseInt(scanner.nextLine());
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getCookingTime() <= maxTime) {
                        System.out.println(r);
                    }
                }

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine().toLowerCase();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    for (String ing : r.getIngredients()) {
                        if (ing.toLowerCase().equals(ingredient)) {
                            System.out.println(r);
                            break;
                        }
                    }
                }
            }
        }
    }
}
