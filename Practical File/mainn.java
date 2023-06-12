class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Bulldog extends Dog {
    void run() {
        System.out.println("Bulldog is running...");
    }
}

class mainn {
    public static void main(String[] args) {
        System.out.println("Aayush Upadhyay");
        System.out.println("09929802021");
        Bulldog bulldog = new Bulldog();
        bulldog.eat();
        bulldog.bark();
        bulldog.run();
    }
}
