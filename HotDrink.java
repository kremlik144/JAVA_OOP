
public class HotDrink extends Drinks 
{
    private int temperature;

    public HotDrink(String name, String color, int volume, int price, int temperature) {
        super(name, color, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", temperature = " + temperature;
    }
        
}
