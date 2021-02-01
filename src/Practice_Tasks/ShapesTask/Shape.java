package Practice_Tasks.ShapesTask;

public class Shape {

    public String name;
    public static boolean isShape, hasArea, hasPerimeter;

    public void setInfo (String name){
        this.name = name;
    }

    static{
        isShape = true;
        hasArea = true;
        hasPerimeter = true;
    }

    public double calcArea (){
        return 0;
    }

    public double calcPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", Area='" + calcArea() + '\'' +
                ", Perimeter='" + calcPerimeter() + '\'' +
                '}';
    }
}


// 1. Create a class called Shape
// variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
// methods: setInfo, calcArea(), calcPerimeter(),
// toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()