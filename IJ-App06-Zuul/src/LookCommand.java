
public class LookCommand extends ZuulCommand
{
    String item;
    public LookCommand(Game zuul, String item)
    {
        super(zuul);
        this.item=item;
    }
    public void execute()
    {
        if( item == null)
        {
            Map map = zuul.MAP;
            System.out.println(map.getCurrentLocation().getLongDescription());
            map.getCurrentLocation().getItemList();
        }
        else if(item.equals("inventory"))
        {
            Player player = zuul.PLAYER;
            player.printInventory();
        }
    }
}
