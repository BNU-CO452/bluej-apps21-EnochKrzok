
/**
 * The Module class has the code title and credit value of the module
 *
 * @author Enoch Jozue Krzok
 * @version 1.0   6/10/2021
 */
public class Module
{
    // A unique identifier
    private String code;
    // The title of the subject
    private String title;
    // The credite value
    private int creditValue;

    /**
     * create a module with a code and title 
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        this.creditValue = 0 ;
    }

    /**
     * return code represent the module code
     */
    public String getCode()
    {
        return code;
    }
    
     /**
     * return code represent the module title
     */
    public String getTitle()
    {
        return title;
    }
   
    /**
     * return code represent the module crediteValue
     */
    public int getCreditValue()
    {
        return creditValue;
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
        System.out.println(" Module Code: " + code + ": " + title + " | Credit Value : " + creditValue);
    }
    
}
