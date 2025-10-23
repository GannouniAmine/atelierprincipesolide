package com.directi.training.ocp.exercise.solution;


public class TimeSlotResource implements Resource {

    private static final int INVALID_RESOURCE_ID = -1;

    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot() {
       
        return 0;
    }

    private void markTimeSlotBusy(int resourceId) {
   
    }

    private void markTimeSlotFree(int resourceId) {
        
    }
}