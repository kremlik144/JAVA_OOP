package Task2;

import java.util.List;

public abstract class Lists<T>{
    private List<T> list;
    
    public Lists(List<T> list) {
        this.list = list;
    }

    public int getSize(){
        return this.list.size();
    }
    
    public T get(int i){
        if(i < getSize() && i >= 0) return list.get(i);
        else return null; 
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
