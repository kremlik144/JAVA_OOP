package Task1.Blockings;

public class FingerprintUnlocker extends Unlocker<String>{
    private String fingerprint;

    public FingerprintUnlocker(int mode, String fingerprint) {
        this.fingerprint = fingerprint;
        this.mode = mode;
    }

    @Override
    public String unlock() {
        return fingerprint;
    }

    @Override
    public String toString() {
        return fingerprint;
    }
    
}
