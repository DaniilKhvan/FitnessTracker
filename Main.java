import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FitnessApp app = new FitnessApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Fitness App Menu ---");
            System.out.println("1. Add Cardio Routine");
            System.out.println("2. Add Strength Routine");
            System.out.println("3. Search by Name");
            System.out.println("4. Filter by Calories");
            System.out.println("5. Sort by Date");
            System.out.println("6. View All Routines");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter duration (minutes): ");
                    int duration = scanner.nextInt();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.next();
                    System.out.print("Enter distance (km): ");
                    int distance = scanner.nextInt();
                    app.addRoutine(new CardioRoutine(name, duration, date, distance));
                }
                case 2 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter duration (minutes): ");
                    int duration = scanner.nextInt();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.next();
                    System.out.print("Enter sets: ");
                    int sets = scanner.nextInt();
                    System.out.print("Enter repetitions: ");
                    int reps = scanner.nextInt();
                    app.addRoutine(new StrengthRoutine(name, duration, date, sets, reps));
                }
                case 3 -> {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    app.searchByName(name).forEach(System.out::println);
                }
                case 4 -> {
                    System.out.print("Enter min calories: ");
                    int min = scanner.nextInt();
                    System.out.print("Enter max calories: ");
                    int max = scanner.nextInt();
                    app.filterByCalories(min, max).forEach(System.out::println);
                }
                case 5 -> app.sortByDate().forEach(System.out::println);
                case 6 -> app.printAllRoutines();
                case 7 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
