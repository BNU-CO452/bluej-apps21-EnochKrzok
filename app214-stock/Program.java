
/**
 * This whole class is made so we can run the program in a terminal
 *
 * @author Enoch Jozue Krzok
 * @version 17/11/2021
 */
public class Program
{
    private static StockApp app;
    
    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}
