public class WorkoutRoutine {
    private String workoutName;
    private int duration; // in minutes
    private int caloriesBurned;

    public WorkoutRoutine(String workoutName, int duration, int caloriesBurned) {
        this.workoutName = workoutName;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public String getWorkoutName() { return workoutName; }
    public void setWorkoutName(String workoutName) { this.workoutName = workoutName; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(int caloriesBurned) { this.caloriesBurned = caloriesBurned; }

    @Override
    public String toString() {
        return "WorkoutRoutine{name='" + workoutName + "', duration=" + duration + " mins, caloriesBurned=" + caloriesBurned + "}";
    }
}