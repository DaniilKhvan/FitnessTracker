public class StrengthRoutine extends WorkoutRoutine {
    private int sets;
    private int repetitions;

    public StrengthRoutine(String name, int duration, String date, int sets, int repetitions) {
        super(name, duration, date);
        this.sets = sets;
        this.repetitions = repetitions;
    }

    public int getSets() {
        return sets;
    }

    public int getRepetitions() {
        return repetitions;
    }

    @Override
    public int calculateCaloriesBurned() {
        // Simplified calorie burn formula: sets * repetitions * 2
        return sets * repetitions * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", StrengthRoutine{sets=" + sets + ", reps=" + repetitions +
               ", calories=" + calculateCaloriesBurned() + "}";
    }
}
