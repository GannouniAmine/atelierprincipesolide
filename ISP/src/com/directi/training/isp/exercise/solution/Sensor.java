package com.directi.training.isp.exercise.solution;

public class Sensor {
    public void register(ISensingDoor door) {
        while(true) {
            if(isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new java.util.Random().nextBoolean();
    }
}

