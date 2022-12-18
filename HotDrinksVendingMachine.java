
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HotDrinksVendingMachine implements VendingMachine
{

    private Map<Integer, HotDrink> products = new TreeMap<>();
    private int wallet = 0;
    private int productId = 0;


    public void addDrink(HotDrink drink)
    {
        this.products.put(productId, drink);
        productId++;
    }

    private String getProduct(String name, int volume, int temperature) 
    {   
        boolean flagPay = false;

        for(HotDrink product: products.values())
        {
            if(product.getName().equals(name))
            {
                if(product.getVolume() == volume)
                {
                    if(product.getTemperature() == temperature)
                    {
                        wallet += product.getPrice();
                        System.out.printf("Thank you for your purchase %s. Deducted from your account %d$\n", product.getName(), product.getPrice());
                        flagPay = true;
                    }
                }
            }
            else continue;   
        }
        if(flagPay) return "\tGoodbye :)";
        else return "\tThis item is not in stock :(";
    }

    
    @Override
    public String toString() {
        System.out.println("Hot Drinks Product: ");        
        for(HotDrink prod: products.values())
        {
            System.out.println("\t" + prod);
        }
        return "End of range";
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
