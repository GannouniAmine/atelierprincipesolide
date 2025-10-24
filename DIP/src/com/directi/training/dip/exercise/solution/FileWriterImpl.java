package com.directi.training.dip.exercise.solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterImpl implements IWriter
{
    private String filePath;

    public FileWriterImpl(String filePath)
    {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            writer.newLine();
        }
    }
}
