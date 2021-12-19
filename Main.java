public class Main {
    public static void main(String[] args){
        Shape circle = new Circle(6);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(4, 5);
        circle.findArea();
        square.findArea();
        rectangle.findArea();
        circle.displayArea();
        square.displayArea();
        rectangle.displayArea();
    }
}
