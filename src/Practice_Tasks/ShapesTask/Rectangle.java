package Practice_Tasks.ShapesTask;

public class Rectangle extends Shape{

    // variables: 4, 1 instance, 3 static
    // methods: 4 instance methods

    public double width, length;

    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
        setInfo("Rectangle");
    }

    public double calcArea (){
        return width * length;
    }

    public double calcPerimeter(){
        return (width*length) *2;
    }



}
