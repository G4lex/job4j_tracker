package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        WolfBall wolfBall = new WolfBall();
        Fox fox = new Fox();
        Ball ball = new Ball();
        hare.tryEat(ball);
        wolfBall.tryEat(ball);
        fox.tryEat(ball);
    }

}
