package com.directi.training.dip.exercise.solution;

import java.io.IOException;

import com.directi.training.dip.exercise.MyDatabase;

public class DatabaseOutputTarget implements OutputTarget {
    private MyDatabase database;

    public DatabaseOutputTarget(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String data) throws IOException {
        database.write(data);
    }
}
