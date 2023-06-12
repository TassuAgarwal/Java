import java.awt.Component;

class Box {
    private double height;
    private double width;
    private double depth;

    Box() {
        height = 0;
        width = 0;
        depth = 0;
    }

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }

    public static Component createVerticalStrut(int i) {
        return null;
    }
}

class Box_new extends Box {
    private double weight;

    Box_new(double h, double w, double d, double wt) {
        super(h, w, d);
        weight = wt;
    }

    double getWeight() {
        return weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("Tassu Agarwal");
        System.out.println("09429802021");
        System.out.println("Volume of box1 is " + box1.volume());
        Box box2 = new Box(10, 20, 30);
        System.out.println("Volume of box2 is " + box2.volume());
        Box_new box3 = new Box_new(5, 10, 15, 20);
        System.out.println("Volume of box3 is " + box3.volume());
        System.out.println("Weight of box3 is " + box3.getWeight());
    }
}
