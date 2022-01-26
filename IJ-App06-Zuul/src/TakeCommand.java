
/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day & Enoch Jozue Krzok
 * @version 01/01/2022
 */
public class TakeCommand extends ZuulCommand
{
    String word;
    private Location location;
    private Item item;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String word)
    {
        super(zuul);
        this.word = word;
    }    

    public void execute()
    {
        if(word == null)
        {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return;
        }
        Map map = zuul.MAP;
        // remove the item from the current room
        // and add it to the player's inventory
        // Print out a suitable message.
        map.getCurrentLocation().takeItem(item);
    }
}
