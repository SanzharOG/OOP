public class Square extends Shape{
    private double length;
    public Square(){}

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void displayArea(){
        System.out.println("Square area = " + area);
    }

    @Override
    public void printArea(){
        System.out.println("Square area = " + area);
    }

    @Override
    public void findArea(){ 
        area = length * length;
    }
}
