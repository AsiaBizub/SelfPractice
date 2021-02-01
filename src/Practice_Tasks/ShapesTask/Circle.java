package Practice_Tasks.ShapesTask;

public class Circle extends Shape {
    // variables: 4, 1 instance, 3 static
    // methods: 4 instance methods


    public double radius, diameter;
    public final static double PI;
    static {
        PI = 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        setInfo("Circle");
        diameter = radius * 2;
    }

    public double calcArea (){
        return radius * radius * PI;
    }

    public double calcPerimeter(){
        return diameter * PI;
    }
}
