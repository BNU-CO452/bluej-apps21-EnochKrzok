import java.util.ArrayList;

public class Player
{
    public ArrayList<Item> inventory;
    public Item item;
    public Location location;
    public Map map;

    public Player()
    {
        inventory = new ArrayList<>();
    }

    /**
     * Adds item to inventory
     */
    public void addInventory(Item item)
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
            System.out.println(item.getItemName());
        }
    }

}
