public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea(){
        System.out.println("Circle area = " + area);
    }

    @Override
    public void printArea(){
        System.out.println("Circle area = " + area);
    }

    @Override
    public void findArea(){
        area = Math.PI * radius * radius;
    }
}
