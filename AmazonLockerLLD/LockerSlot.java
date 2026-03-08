package AmazonLockerLLD;

public class LockerSlot {
    private int slotId;
    private LockerSize size;
    private boolean isAvailable;
    private Package pkg;

    public LockerSlot(int slotId ,LockerSize size){
        this.slotId = slotId;
        this.size = size;
        this.isAvailable = true;
    }

    public boolean isAvailiable() {
        return isAvailable;
    }

    public void assignPackage(Package pkg) {
        this.pkg = pkg;
        this.isAvailable = false;
    }

    public LockerSize getSize(){
        return this.getSize();
    }

    public void releaseSlot(){
        this.pkg = null;
        this.isAvailable = true;
    }

    public Package getPackage(){
        return pkg;
    }
}
