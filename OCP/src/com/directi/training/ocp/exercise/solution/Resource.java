package com.directi.training.ocp.exercise.solution;


public interface Resource {
    int allocate();
    void free(int resourceId);
}