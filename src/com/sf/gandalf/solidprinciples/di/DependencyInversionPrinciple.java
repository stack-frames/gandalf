package com.sf.gandalf.solidprinciples.di;

public class DependencyInversionPrinciple {

    static void main(String[] args) {
        Database db = new PostgreSQLDatabase();
        UserService userService = new UserService(db);
        userService.process();
    }
}
