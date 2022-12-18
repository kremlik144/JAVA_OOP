
/* 
    При решении этих задач следуйте принципам абстракции, 
    инкапсуляции, наследования, полиморфизма.

    + 1. Создайте унаследованный класс ГорячийНапиток с
    дополнительным полем int температура.

    +- 2. Создайте класс АвтоматГорячихНапитков, реализующий
    интерфейс ТорговыйАвтомат и реализуйте перегруженный метод
    getProduct(int name, int volume, int temperature), выдающий 
    продукт, соответствующий имени, объему и температуре.

    +- 3. В main проинициализируйте несколько ГорячихНапитков и
    АвтоматГорячихНапитков и позвольте покупателю купить товар.
*/

public class Program 
{
    public static void main(String[] args) 
    {
        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();


        machine.addDrink(new HotDrink("tea", "dark", 500, 40, 25));
        machine.addDrink(new HotDrink("tea", "orange", 500, 50, 40));
        machine.addDrink(new HotDrink("coffee", "dark", 450, 60, 55));
        machine.addDrink(new HotDrink("mulled wine (non-alcoholic)", "red", 300, 120, 45));
        machine.addDrink(new HotDrink("mulled wine (non-alcoholic)", "dark", 300, 125, 45));




        System.out.println(machine.toString());
        System.out.println(machine.getProduct());
        
        
        
        
    


    }
    
}
