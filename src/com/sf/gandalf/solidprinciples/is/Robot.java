package com.sf.gandalf.solidprinciples.is;

public class Robot implements Workable {

    @Override
    public void work() {
        System.out.printf("\n [%s] - I am Working!", this.getClass().getName());
    }
}
