
public class HotDrink extends Drinks 
{
    private int temperature;

    public HotDrink(String name, String color, double volume, int price, int temperature) {
        super(name, color, volume, price);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return super.toString() + ", temperature= " + temperature;
    }

    

    

    
    
}
