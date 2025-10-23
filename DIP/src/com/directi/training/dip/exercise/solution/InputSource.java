package com.directi.training.dip.exercise.solution;

import java.io.IOException;

public interface InputSource {
    String read() throws IOException;
}