package pl.coderslab.taskmanager;

import java.util.Arrays;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
//        return System.console().readLine();
    }

    private static boolean validateUserChoice(String userChoice) {
        String[] validChoices = {"add", "remove", "list", "exit"};
        // Do wykorzystania metody binarySearch potrzebujemy
        // posortowanej tablicy!!!!
        Arrays.sort(validChoices);
        int index = Arrays.binarySearch(validChoices, userChoice);
        return index >= 0;
    }

    private static void executeValidChoice(String userChoice) {
        switch (userChoice) {
            case "add":
                // tutaj dostarcz obsługę
                // executeAddChoice();
                break;
            case "remove":
                // tutaj dostarcz obslugę
                // executeRemoveChoice();
                break;
            case "list":
                // tutaj dostarcz obsługę
                // executeListChoice();
                break;
        }
    }

    private static boolean isExitChoice(String userChoice) {
        return "exit".equalsIgnoreCase(userChoice);
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
        System.out.println(ConsoleColors.RED + "Goodbye and remember to come back soon");
        System.out.print(ConsoleColors.RESET);
    }

    private static void showWelcomeMessage() {
        System.out.println(ConsoleColors.RED + "Welcome in Task Manager");
        System.out.print(ConsoleColors.RESET);
    }
}
