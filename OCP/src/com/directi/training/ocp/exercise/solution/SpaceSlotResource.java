package com.directi.training.ocp.exercise.solution;



public class SpaceSlotResource implements Resource {

    private static final int INVALID_RESOURCE_ID = -1;

    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot() {
        return 0;
    }

    private void markSpaceSlotBusy(int resourceId) {
       
    }

    private void markSpaceSlotFree(int resourceId) {
      
    }
}