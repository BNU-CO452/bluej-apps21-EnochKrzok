import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Class Location - a location on the map of an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Location" represents one place in the scenery of the game.  It is 
 * connected to other locations via exits.  For each existing exit, the 
 * location stores a reference to the neighboring locations.
 * 
 * @author  Michael Kölling and David J. Barnes
 * Modified by Derek Peacock & Nicholas Day & Enoch Jozue Krzok
 * @version 01/01/2022
 */

public class Location {
    private String description;
    // stores exit of this room.
    private HashMap<String, Location> exits;
    public ArrayList<Item> itemList;
    public Item item;
    public Player player;

    /**
     * Create a location described by "description".
     * Initially, a location has no exits.
     * "description" is something like "a kitchen" or
     * "an open court yard".
     */
    public Location(String description) {
        this.description = description;

        exits = new HashMap<>();
        itemList = new ArrayList<>();
    }

    /**
     * Define an exit from this room.
     *
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Location neighbor) {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription() {
        return description;
    }

    /**
     * Return a description of the room in the form:
     * You are in the kitchen.
     * Exits: north west
     *
     * @return A long description of this room
     */
    public String getLongDescription() {
        return " You are " + description + ".\n" + getExitString();
    }

    /**
     * Return a string listing the locations's exits,
     * for example "Exits: north west".
     */
    private String getExitString() {
        String exitNames = " Exits: ";
        Set<String> keys = exits.keySet();

        for (String exit : keys) {
            if (exitNames.length() > 8)
                exitNames += ", " + exit;
            else
                exitNames += exit;
        }
        return exitNames;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     *
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Location getExit(String direction) {
        return exits.get(direction);
    }

    public void setItem(Item item)
    {
        itemList.add(item);
    }
    /**
     * Prints all items in the location
     */
    public void getItemList()
    {
        System.out.println(" You found items: ");
        for (Item item : itemList)
        {
            System.out.println(" " + item.getItemName() + " : " + item.getItemDescription());
            System.out.println("\n");
        }
    }

    public void takeItem(Item item)
    {

        if(itemList.contains(item))
        {
            player.addInventory(item);
            itemList.remove(item);
            System.out.println(" The item '" + item.getItemName() + "' has been taken. " + item.getItemDescription() + "\n");
        }
        else
        {
            System.out.println("you have failed");
        }
    }
}


