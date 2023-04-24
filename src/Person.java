public class Person {
    private String name;
    private int age;
    private String height;
    private String weight;

    public Person(String name, int age, String height, String weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }
}
