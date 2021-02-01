package Practice_Tasks.ShapesTask;

public class Cube extends Shape {

    public double side;

    public Cube(double side) {

        this.side = side;
        setInfo("Cube");
    }

    public double calcArea() {
        return new Square(side).calcArea() * 6;
    }

    public double calcPerimeter (){
        return side *12;
    }
}

