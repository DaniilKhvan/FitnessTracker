public class Main {
    public static void main(String[] args) {
        User user1 = new User("Daniil", 20, 70, 1.65);

        WorkoutRoutine routine1 = new WorkoutRoutine("Running", 30, 300);
        WorkoutRoutine routine2 = new WorkoutRoutine("Judo", 90, 700);

        FitnessApp app = new FitnessApp(user1);
        app.addWorkoutRoutine(routine1);
        app.addWorkoutRoutine(routine2);

        System.out.println(user1);
        System.out.println("BMI: " + user1.calculateBMI());
        app.displayWorkoutRoutines();
    }
}