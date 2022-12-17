
import java.util.LinkedList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    private List<HotDrink> hotDrinksProduct = new LinkedList<>();
    private int wallet;


    public void addDrink(HotDrink drink)
    {
        this.hotDrinksProduct.add(drink);
    }

    
    @Override
    public String toString() {
        return "Hot Drinks Product: " + hotDrinksProduct;
    }

    @Override
    public void getProduct()
    {
        // TODO Auto-generated method stub
        
    }

    

  

   
    
}
