package com.sf.gandalf.solidprinciples.di;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database!");
    }
}
