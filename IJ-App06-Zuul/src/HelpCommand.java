/**
 * Write a description of class HelpCommand here.
 *
 * @author Enoch Jozue Krzok
 * @version 01/01/2022
 */
public class HelpCommand extends ZuulCommand
{
    public HelpCommand(Game zuul)
    {
        super(zuul);
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and
     * a list of the command words.
     */
    public void execute()
    {
        System.out.println(" You are lost. You are alone. You wander");
        System.out.println(" on a weird island");
        System.out.println();
        System.out.println(" Your command words are:");
        System.out.println();
        
        for(CommandWords command : CommandWords.values())
        {
            System.out.println(" " + command.word + 
                               "\t  : " + command.description);                        
        }   
        System.out.println();
        System.out.println(" e.g. go west, take key");
        System.out.println();
        System.out.println(zuul.MAP.getCurrentLocation().getLongDescription());
    }
}
