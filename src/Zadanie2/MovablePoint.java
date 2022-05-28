package Zadanie2;

public class MovablePoint implements Movable{
    int x;
    int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x:" + this.x + " y:" + this.y;
    }

    @Override
    public void moveUp() {
        this.x += 1;
    }

    @Override
    public void moveDown() {
        this.x -= 1;
    }

    @Override
    public void moveLeft() {
        this.y += 1;
    }

    @Override
    public void moveRight() {
        this.y -= 1;
    }
}
