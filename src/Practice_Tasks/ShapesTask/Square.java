package Practice_Tasks.ShapesTask;

public class Square extends Shape {
    // variables: 4, 1 instance, 3 static
    // methods: 4 instance methods

    public double side;
    public Square (double side){
        this.side= side;
        setInfo ("Square");
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }
}
