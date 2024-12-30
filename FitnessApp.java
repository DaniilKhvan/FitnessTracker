import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FitnessApp {
    private List<WorkoutRoutine> routines;

    public FitnessApp() {
        this.routines = new ArrayList<>();
    }

    public void addRoutine(WorkoutRoutine routine) {
        routines.add(routine);
    }

    public List<WorkoutRoutine> searchByName(String name) {
        return routines.stream()
                       .filter(r -> r.getName().equalsIgnoreCase(name))
                       .collect(Collectors.toList());
    }

    public List<WorkoutRoutine> filterByCalories(int minCalories, int maxCalories) {
        return routines.stream()
                       .filter(r -> {
                           int calories = r.calculateCaloriesBurned();
                           return calories >= minCalories && calories <= maxCalories;
                       })
                       .collect(Collectors.toList());
    }

    public List<WorkoutRoutine> sortByDate() {
        return routines.stream()
                       .sorted(Comparator.comparing(WorkoutRoutine::getDate))
                       .collect(Collectors.toList());
    }

    public void printAllRoutines() {
        if (routines.isEmpty()) {
            System.out.println("No routines added yet!");
        } else {
            routines.forEach(System.out::println);
        }
    }
}
