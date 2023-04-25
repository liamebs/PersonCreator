public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson", 34,
                180, 73.5);
        Person Person02 = new Person("Bob Thornley", 25,
                171, 68.2);

        System.out.println(Person01.getName());
        System.out.println("Age: " + Person01.getAge());
        System.out.println("Height: " + Person01.getHeight() + "cm");
        System.out.println("Weight: " + Person01.getWeight() + "lbs");
        System.out.println();
        System.out.println(Person02.getName());
        System.out.println("Age: " + Person02.getAge());
        System.out.println("Height: " + Person02.getHeight() + "cm");
        System.out.println("Weight: " + Person02.getWeight() + "lbs");
        Person01.growOlder();
        System.out.println();
        System.out.println(Person01.getName());
        System.out.println("Age: " + Person01.getAge());
        System.out.println("Height: " + Person01.getHeight() + "cm");
        System.out.println("Weight: " + Person01.getWeight() + "lbs");
        System.out.println();
    }
}