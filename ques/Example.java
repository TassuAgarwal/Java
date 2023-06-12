class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Aayush Upadhyay");
        System.out.println("09929802021");
        System.out.println("The animal is eating.");
    }
}

class Cat extends Animal {
    int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public void eat() {
        super.eat();
        System.out.println("The cat is eating.");
    }

    public void meow() {
        System.out.println("The cat says meow.");
    }

    public void display() {
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + age);
    }
}

public class Example {
    public static void main(String[] args) {
        Cat cat = new Cat("bhaw bhaw", 3);
        cat.eat();
        cat.meow();
        cat.display();
    }
}