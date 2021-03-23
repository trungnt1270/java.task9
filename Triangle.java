package java1.task9;

public class Triangle implements Shape{
    private int base, height;

    public Triangle(int base,int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString(){
        return "Triangle[base" + base + ",height=" + height + "]";
    }

    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
