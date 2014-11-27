// main program to run the GroceryList
import java.util.*;
public class Groceries
{
  public static void main(String[] args)
  {
    GroceryList list  = new Grocerylist();
    list.add(new GroceryItem("Oreos",3,2.5));
    list.add(new GroceryItem("Goldfish Crackers", 2, 1.75));
    list.add(new GroceryItem("Apple", 8, .23));
    list.add(new GroceryItem("Fruit Loops", 2, 4.32));
    list.add(new GroceryItem("Pop Tarts", 4, 3.67));
    System.out.println("Grocery List");
    System.out.println(list.toString());
    System.out.println(list.getTotalCost());
  }
}
