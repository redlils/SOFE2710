import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Helper class for prompting the user for input via {@link System#in}
 * @author Lily Redpath
 */
public class ConsoleInterface {

    private static Scanner sc;

    public static void initializeScanner() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }
    }

    public static void teardownScanner() {
        if (sc != null) {
            sc.close();
            sc = null;
        }
    }

    /**
     * Prompt the user to select an index within an array. Handles incorrect
     * inputs from the user, and will always provide a valid choice from the
     * provided list of options.
     *
     * @param prompt String of text that prompts the user to select an item
     * @param optionPrompts List of options the user can select from
     * @return A 0-based index representing the choice the user made
     * @author Lily Redpath
     */
    public static int presentMenu(String prompt, List<String> optionPrompts) {
        int selection = 0;
        Scanner sc = new Scanner(System.in);

        while (selection < 1 || selection > optionPrompts.size()) {
            System.out.println(prompt);

            for (int i = 0; i < optionPrompts.size(); i++) {
                String optionPrompt = optionPrompts.get(i);
                System.out.println("[" + (i + 1) + "] - " + optionPrompt);
            }

            try {
                selection = sc.nextInt();
                if (selection < 1 || selection > optionPrompts.size()) {
                    System.out.print("Invalid selection! ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid number! ");
            }
        }
        return selection - 1;
    }

    /**
     * Prompt the user to select an index within an array. Handles incorrect
     * inputs from the user, and will always provide a valid choice from the
     * provided list of options.
     *
     * @param prompt String of text that prompts the user to select an item
     * @param optionPrompts List of options the user can select from
     * @return A 0-based index representing the choice the user made
     * @author Lily Redpath
     * @see ConsoleInterface#presentMenu(String, List) 
     */
    public static int presentMenu(String prompt, String... optionPrompts) {
        return presentMenu(prompt, List.of(optionPrompts));
    }
}
