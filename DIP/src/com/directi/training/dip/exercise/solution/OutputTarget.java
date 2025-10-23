package com.directi.training.dip.exercise.solution;

import java.io.IOException;

public interface OutputTarget {
    void write(String data) throws IOException;
}