import java.util.ArrayList;
import java.util.List;

public class FitnessApp {
    private User user;
    private List<WorkoutRoutine> workoutRoutines;

    public FitnessApp(User user) {
        this.user = user;
        this.workoutRoutines = new ArrayList<>();
    }

    public void addWorkoutRoutine(WorkoutRoutine workout) {
        workoutRoutines.add(workout);
    }

    public void displayWorkoutRoutines() {
        System.out.println("Workout Routines for " + user.getName() + ":");
        for (WorkoutRoutine routine : workoutRoutines) {
            System.out.println(routine);
        }
    }

    @Override
    public String toString() {
        return "FitnessApp{user=" + user + ", workoutRoutines=" + workoutRoutines + "}";
    }
}