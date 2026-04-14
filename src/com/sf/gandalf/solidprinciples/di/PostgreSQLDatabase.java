package com.sf.gandalf.solidprinciples.di;

public class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL Database!");
    }
}
