class A {
    public void printA() {
        System.out.println("This is A");
    }
}

class B extends A {
    public void printB() {
        System.out.println("This is B");
    }
}

class C extends B {
    public void printC() {
        System.out.println("This is C");
    }
}

public class ques12 {
    public static void main(String[] args) {
        C c = new C();
        c.printA();
        c.printB();
        c.printC();
    }
}