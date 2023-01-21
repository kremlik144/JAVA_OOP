package Task2;

import java.util.List;
import java.util.ArrayList;

public class MutableLists<T> extends Lists<T>{
    private List<T> newList;

    public MutableLists(List<T> list) { 
        super(list);
        this.newList = list;
    }

    public void add (T newValue){
        List<T> arr = new ArrayList<>();
        for(T value : newList){
            arr.add(value);
        }
        arr.add(newValue);
        newList = arr;
    }

    public void set (int index, T newValue){
        List<T> arr = new ArrayList<>();
        for(T value : newList){
            arr.add(value);
        }
        arr.set(index, newValue);
        newList = arr;
    }

    public void remove (T newValue){
        List<T> arr = new ArrayList<>();
        for(T value : newList){
            if(value != newValue) arr.add(value);
        }
        newList = arr;
    }
    
    @Override
    public String toString() {
        return newList.toString();
    }
}
