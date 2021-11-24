
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling and Enoch Jozue Krzok
 * @version 3/11/21
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;

        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers

        runDemo();
    }

    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        addProducts();
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }

    /**
     * adds stock with ID and name.
     */
    private void addProducts()
    {
        stock.add(new Product(101, "Horizon Zero Dawn"));
        stock.add(new Product(102, "Forza Horizon 5"));
        stock.add(new Product(103, "League of Ledgends"));
        stock.add(new Product(104, "CSGO"));
        stock.add(new Product(105, "Hot Wheels Unleashed"));
        stock.add(new Product(106, "Assassin's Creed Valhalla"));
        stock.add(new Product(107, "Far Cry 6"));
        stock.add(new Product(108, "Battlefield 2042"));
        stock.add(new Product(109, "Test Drive Unlimited Solar Crown"));
        stock.add(new Product(110, "Horizon Forbidden west"));
    }
    
    /**
     * buys stocks by ID with given amount.
     */
    private void buyProducts()
    {
        stock.buyProduct(101, 231);
        stock.buyProduct(102, 1000);
        stock.buyProduct(104);
        stock.buyProduct(105, 738);
        stock.buyProduct(106, 395);
        stock.buyProduct(107, 51);
        stock.buyProduct(108, 217);
        stock.buyProduct(109, 111);
        stock.buyProduct(110, 986);
    }

    /**
     * sells stocks by ID with given amount.
     */
    private void sellProducts()
    {
        stock.sellProduct(101, 123);
        stock.sellProduct(102, 768);
        stock.sellProduct(103, 7);
        stock.sellProduct(104, 17);
        stock.sellProduct(105, 167);
        stock.sellProduct(106, 337);
        stock.sellProduct(107, 21);
        stock.sellProduct(108, 127);
        stock.sellProduct(109, 11);
        stock.sellProduct(110, 896);
    }    
}