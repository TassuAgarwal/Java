public class Person {
    private String name;
    private int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name) {
        this.name = name;
        age = 0;
    }

    public Person(int age) {
        name = "Unknown";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();
        Person person2 = new Person("Aayush");
        person2.display();
        Person person3 = new Person(19);
        person3.display();
        Person person4 = new Person("Krishna", 19);
        person4.display();
    }
}
