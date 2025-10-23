package com.directi.training.dip.exercise.solution;


import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    public void encode(InputSource source, OutputTarget target) throws IOException {
        String input = source.read();
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        target.write(encoded);
    }
}

