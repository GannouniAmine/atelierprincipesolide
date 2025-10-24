package com.directi.training.dip.exercise.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EncodingModule
{
    public void encodeFile(IWriter writer, String filePath) throws IOException
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
        }
    }
}
