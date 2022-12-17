
public class Drinks 
{
    private String name;
    private String color;
    private double volume;
    private int price;

    public Drinks(String name, String color, double volume, int price) {
        this.name = name;
        this.color = color;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\tname= " + name + ", color= " + color + ", volume= " + volume + ", price= " + price;
    }

    
        
}
