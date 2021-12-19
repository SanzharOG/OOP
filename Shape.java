public class Shape{
    protected double area;

    public Shape(){
        this.area = 0;
    }

    public void findArea(){
        this.area = 1;
    }

    public void displayArea(){
        System.out.println("Shape area = " + area);
    }

    public void printArea(){ 
        System.out.println("Shape area = " + area);
    }
}