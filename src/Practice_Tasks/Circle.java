package Practice_Tasks;

public class Circle {
    double radius, diameter, area, perimeter;
    static double PI=3.14;

    public Circle() {
        this.radius = radius;
        diameter = 2 * radius;
        area = PI * Math.pow(radius, 2);
        perimeter = PI * diameter;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle ();
        System.out.println(circle1);
    }
}


