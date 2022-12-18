
public class Drinks 
{
    private String name;
    private String color;
    private int volume;
    private int price;

    public Drinks(String name, String color, int volume, int price) {
        this.name = name;
        this.color = color;
        this.volume = volume;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name = " + name + ", color = " + color + ", volume = " + volume + ", price = " + price;
    }
          
}
