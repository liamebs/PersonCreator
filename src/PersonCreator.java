public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson", 34,
                "180cm", "73.5lbs");
        Person Person02 = new Person("Bob Thornley", 25,
                "171cm", "68.2lbs");

        System.out.println(Person01.getName());
        System.out.println("Age: " + Person01.getAge());
        System.out.println("Height: " + Person01.getHeight());
        System.out.println("Weight: "  + Person01.getWeight());
        System.out.println();
        System.out.println(Person02.getName());
        System.out.println("Age: " + Person02.getAge());
        System.out.println("Height: " + Person02.getHeight());
        System.out.println("Weight: "  + Person02.getWeight());
    }
}