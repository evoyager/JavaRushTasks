package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen = true;

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
    }

    @Override
    void draw(Canvas canvas) {
        canvas.setPoint(x, y,'O');
    }

    @Override
    void move() {
        if (!isFrozen) {
            setX(x+dx);
            setY(y+dy);
        }
    }

    void start() {
        isFrozen = false;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }
}
