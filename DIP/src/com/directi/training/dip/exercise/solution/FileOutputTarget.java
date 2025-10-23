package com.directi.training.dip.exercise.solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputTarget implements OutputTarget {
    private String filePath;

    public FileOutputTarget(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(data);
        writer.close();
    }
}
