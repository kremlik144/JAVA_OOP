package Task1.Blockings;

public class FaceIDUnlocker extends Unlocker<String>{
    private String faceID;
    

    public FaceIDUnlocker(int mode, String faceID) {
        this.faceID = faceID;
        this.mode = mode;
    }

    @Override
    public String unlock() {
        return faceID;
    }
    
}
