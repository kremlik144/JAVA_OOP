package Task1.Blockings;

public class PinUnlocker extends Unlocker<Integer>{
    private int pin;
    
    public PinUnlocker(int mode, int pin) {
        this.mode = mode;
        this.pin = pin;
    }

    @Override
    public Integer unlock() {
        return pin;
    }

    @Override
    public String toString() {
        return "" + pin;
    }
    
}
