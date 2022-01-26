import java.util.ArrayList;

public class Player
{
    public ArrayList<Item> inventory;
    //private Hitpoints hp;
    //private Strenth str;
    public Player()
    {
        inventory = new ArrayList<>();
    }

    public void add(Item item)
    {
        inventory.add(item);
    }

    /**
     * Prints inventory
     */
    public void printInventory()
    {
        System.out.println("The items in inventory are:");
        for (Item item : inventory) {
            System.out.println(item.getItemName()+item.getItemDescription());
        }
    }

}
