
/**
 * creates items
 */

public class Item
{

    private String name;
    private String description;

    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getItemName()
    {
        return name;
    }

    public String getItemDescription()
    {
        return description;
    }

}

