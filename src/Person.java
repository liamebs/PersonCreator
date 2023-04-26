public class Person {  // initialise class variables
    private String name;
    private int age;
    private int height;
    private double weight;

    public Person(String name, int age, int height, double weight) {
        // initialise instance attributes from class variables
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // behavioural method to update person attributes
    public void growOlder() {
        age++;
        height--;
        weight -= 0.5;
    }
}
