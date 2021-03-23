package java1.task9;

public class MovablePoint implements Moveable{
    private int x,y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    @Override
    public void moveUP(){
        y--;
    }
    @Override
    public void moveDown(){
        y++;
    }
    public void moveLeft() {
        x--;
    }
    public void moveRight() {
        x++;
    }
}
