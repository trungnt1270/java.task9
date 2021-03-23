package java1.task9;

public class Rectangle implements  Shape{
    private int length, width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){
        return "Reactangle[length=" + length + ",width=" + width + "]";
    }

    @Override
    public double getArea(){
        return length*width;
    }
}
