package com.directi.training.dip.exercise.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputSource implements InputSource {
    private String filePath;

    public FileInputSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        return sb.toString();
    }
}
