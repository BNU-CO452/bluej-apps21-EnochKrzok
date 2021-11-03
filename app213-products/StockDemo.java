
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
        
        stock.add(new Product(101, "Nomads of the North"));
        stock.add(new Product(102, "Butterfly Lion"));
        stock.add(new Product(103, "Golden Compass"));
        stock.add(new Product(104, "Necromancer"));
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
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 921);
        stock.buyProduct(102, 4);
        stock.buyProduct(103, 51);
        stock.buyProduct(104, 13);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 920);
        stock.sellProduct(102);
        stock.sellProduct(103, 21);
        stock.sellProduct(104, 14);
    }    
}