package com.sf.gandalf.solidprinciples.is;

public class Human implements Workable, Eatable {

    @Override
    public void eat() {
        System.out.printf("\n [%s] - I am Eating!", this.getClass().getName());
    }

    @Override
    public void work() {
        System.out.printf("\n [%s] - I am Working!", this.getClass().getName());
    }
}
