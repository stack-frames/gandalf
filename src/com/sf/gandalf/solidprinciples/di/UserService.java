package com.sf.gandalf.solidprinciples.di;

public class UserService {

    private Database db;

    UserService(Database database) {
        this.db = database;
    }

    public void process() {
        db.connect();
    }
}
