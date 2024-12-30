import java.util.Objects;

public abstract class WorkoutRoutine {
    private String name;
    private int duration; // in minutes
    private String date; // e.g., "YYYY-MM-DD"

    public WorkoutRoutine(String name, int duration, String date) {
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getDate() {
        return date;
    }

    // Abstract method for calorie calculation
    public abstract int calculateCaloriesBurned();

    @Override
    public String toString() {
        return "WorkoutRoutine{name='" + name + "', duration=" + duration +
               " minutes, date='" + date + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutRoutine that = (WorkoutRoutine) o;
        return duration == that.duration &&
               Objects.equals(name, that.name) &&
               Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, date);
    }
}
