package com.directi.training.ocp.exercise.solution;

import java.util.ArrayList;
import java.util.List;

public class ResourceAllocator {
    private List<Resource> resources = new ArrayList<>();

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public int allocateResource(Resource resource) {
        return resource.allocate();
    }

    public void freeResource(Resource resource, int resourceId) {
        resource.free(resourceId);
    }
}