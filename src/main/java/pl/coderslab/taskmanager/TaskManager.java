package pl.coderslab.taskmanager;

public class TaskManager {

    public static void main(String[] args) {
        TaskManager.run();
    }

    public static void run() {

        showWelcomeMessage();
        while (true) {
            showMainMenu();
            String userChoice = getUserChoice();
            if (validateUserChoice(userChoice)) {
                executeValidChoice(userChoice);
                if (isExitChoice(userChoice)) {
                    break;
                }
            } else {
                executeInvalidChoice(userChoice);
            }
        }
        showExitMessage();
    }

    private static String getUserChoice() {
        return "";
    }

    private static boolean validateUserChoice(String userChoice) {
        return false;
    }

    private static void executeValidChoice(String userChoice) {
    }

    private static boolean isExitChoice(String userChoice) {
        return false;
    }

    private static void executeInvalidChoice(String userChoice) {
        System.out.println(ConsoleColors.RED_BACKGROUND + "Invalid option: '"
                + userChoice + "'. Please choose a valid option");
        System.out.println(ConsoleColors.RESET);
    }

    private static void showMainMenu() {
        System.out.println(ConsoleColors.BLUE + "Please select an option:");
        System.out.print(ConsoleColors.RESET);
        System.out.println("\tadd");
        System.out.println("\tremove");
        System.out.println("\tlist");
        System.out.println("\texit");
    }

    private static void showExitMessage() {
        System.out.println(ConsoleColors.RED + "Goodbye and remember to be back soon");
        System.out.print(ConsoleColors.RESET);
    }

    private static void showWelcomeMessage() {
        System.out.println(ConsoleColors.RED + "Welcome in Task Manager");
        System.out.print(ConsoleColors.RESET);
    }
}
