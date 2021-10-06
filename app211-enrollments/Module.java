
/**
 * Write a description of class Module here.
 *
 * @author (Enoch Jozue Krzok)
 * @version (1.0   6/10/2021)
 */
public class Module
{
    // A unique identifier
    private String mCode;
    // The title of the subject
    private String mTitle;
    // The credite value
    private int creditValue;

    /**
     * create a module with a code and title 
     */
    public Module(String mCode, String mTitle)
    {
        this.mCode = mCode;
        this.mTitle = mTitle;
    }

    /**
     * Set the credite of the module
     */
    public void setCredit(int creditValue)
    {
        this.creditValue = creditValue;
    }
    
    /**
     * Print the Module's code, title and the credit_value
     */
    public void print()
    {
        System.out.println(" Module Code: " + mCode + ": " + mTitle + " | Credit Value : " + creditValue);
    }
    
}
