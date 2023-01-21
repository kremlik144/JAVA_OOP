package Task1.Blockings;

public abstract class Unlocker<T>{
    protected int mode;
    public abstract T unlock();
}
