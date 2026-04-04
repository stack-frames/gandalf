package com.sf.gandalf.solidprinciples.is;

public class InterfaceSegregationDemo {

    static void main() {
        System.out.println("I am inside InterfaceSegregationDemo");
        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();

    }
}
