package com.directi.training.dip.exercise.solution;

import java.io.IOException;
import java.util.Base64;

import com.directi.training.dip.exercise.MyDatabase;

public class DatabaseWriter implements IWriter
{
    private MyDatabase database;

    public DatabaseWriter(MyDatabase database)
    {
        this.database = database;
    }

    @Override
    public void write(String data) throws IOException
    {
        String encoded = Base64.getEncoder().encodeToString(data.getBytes());
        database.write(encoded);
    }
}
