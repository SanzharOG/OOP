public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void displayArea(){
        System.out.println("Rectangle area = " + area);
    }

    @Override
    public void printArea(){
        System.out.println("Rectangle area = " + area);
    }

    @Override
    public void findArea(){
        area = length * breadth;
    }
}
