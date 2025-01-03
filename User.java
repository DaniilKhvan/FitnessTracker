public class User {
    private String name;
    private int age;
    private double weight;
    private double height;

    public User(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double calculateBMI() {
        return weight / (height * height);
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", weight=" + weight + "kg, height=" + height + "m}";
    }
}