public class CardioRoutine extends WorkoutRoutine {
    private int distance; // in kilometers

    public CardioRoutine(String name, int duration, String date, int distance) {
        super(name, duration, date);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int calculateCaloriesBurned() {
        // Simplified calorie burn formula: distance * 60
        return distance * 60;
    }

    @Override
    public String toString() {
        return super.toString() + ", CardioRoutine{distance=" + distance + " km, calories=" + calculateCaloriesBurned() + "}";
    }
}
