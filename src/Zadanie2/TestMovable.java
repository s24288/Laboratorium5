package Zadanie2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 10);
        System.out.println(movablePoint.toString());

        movablePoint.moveDown();
        movablePoint.moveRight();

        System.out.println(movablePoint.toString());

        movablePoint.moveUp();
        movablePoint.moveLeft();

        System.out.println(movablePoint.toString());
    }



}
