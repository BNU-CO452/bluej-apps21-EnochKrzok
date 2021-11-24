
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Enoch Jozue Krzok
 * @version 17/11/2021
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    private StockDemo stockDemo;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit") | choice.equals("q") )
        {
            System.out.println("You have quit the app and it did not save");
            return true;
        }
        else if(choice.equals("add"))
        {
            int id = reader.getInt("Please enter ID of Product > ");
            String name = reader.getString("Please enter name of Product > ");
            Product product = new Product(id, name);
            stock.add(product);
            System.out.println("Product " +product.getName()+ " with ID " 
                                +product.getID()+ " has been added");
        }
        else if(choice.equals("remove"))
        {
            int id = reader.getInt("Please enter ID of Product > ");
            stock.remove(id);
            System.out.println("Product with ID " +id+ " has been added");
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("buy"))
        {
            int id = reader.getInt("Please enter ID of Product > ");
            int amount = reader.getInt("Please enter amount of Product to buy > ");
            stock.buyProduct(id,amount);
            System.out.println("you have brought Product with ID " +id+" "+amount+ " times");
        }
        else if(choice.equals("sell"))
        {
            int id = reader.getInt("Please enter ID of Product > ");
            int amount = reader.getInt("Please enter amount of Product to sell > ");
            stock.sellProduct(id,amount);
            System.out.println("you have sold Product with ID " +id+" "+amount+ " times");
        }
        else if(choice.equals("search"))
        {
            String phrase = reader.getString("Please enter name of Product > ");
            stock.findProducts(phrase);
        }
        else if(choice.equals("lowstock") | choice.equals("low stock"))
        {
            stock.lowStock();
            String yorn = reader.getString("would you like to restock all (Y/N) > "); 
            if(yorn.equals("y"))
            {
                stock.reStock();
            }
            else if(yorn.equals("n"))
            {
                System.out.println("You will go back to main menu");
            }
            else
            {
                System.out.println("Invalid input you will go back to main menu");
            }
        }
        else if(choice.equals("re-stock"))
        {
            
        }
        else if(choice.equals("sd"))
        {
            StockDemo demo;
        }
        else
        {
            System.out.println("Invalid input try again");
        }
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Search:     Search for products by what there name starts with, it will give you ID and quantity of product");
        System.out.println("    Buy:        Buy an existing product by ID");
        System.out.println("    Sell:       Sell an existing product by ID");
        System.out.println("    Low Stock:   Print all products that have low stock, then have a option if you want to restock the low stock");
        System.out.println("    Re-stock:   Restock the products that have lowstock");
        System.out.println("    Print:      Print all the products, this will show the name, ID and quantity of all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Enoch Jozue Krzok");
        System.out.println("********************************");
    }
}