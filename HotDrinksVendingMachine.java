
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotDrinksVendingMachine implements VendingMachine{

    private List<HotDrink> hotDrinksProduct = new LinkedList<>();
    private int wallet;


    public void addDrink(HotDrink drink)
    {
        this.hotDrinksProduct.add(drink);
    }

    private String getProduct(String name, int volume, int temperature) 
    {
        // TODO Auto-generated method stub
        return "work";
    }

    
    @Override
    public String toString() {
        return "Hot Drinks Product: " + hotDrinksProduct;
    }

    @Override
    public String getProduct() {
        Scanner scan = new Scanner(System.in);

        try
        {
            System.out.print("Enter the NAME of the desired drink: ");
            String name = scan.nextLine();

            System.out.print("Enter the VOLUME of the desired drink(ml): ");
            String volume = scan.nextLine();
            int vol = Integer.parseInt(volume);

            System.out.print("Enter the TEMPERATURE of the desired drink(C): ");
            String temperature = scan.nextLine();
            int temper= Integer.parseInt(temperature);
            String result = getProduct(name, vol, temper);
            return result;
        } 
        catch(Exception ex)
        {
            System.out.println("You entered incorrect data.");
            return "Repeat the operation";
        }
        finally
        {
            scan.close();
        }
               
    }

    

   
    
}
