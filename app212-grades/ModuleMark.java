
/**
 * Write a description of class ModuleMark here.
 *
 * @author Derek Peacock and Nicholas Day and Enoch Jozue Krzok
 * @version 2.0 20/10/2021
 */
public class ModuleMark
{
    private int mark;
    private Module module;
    
    /**
     * Constructor for objects of class ModuleMark
     */
    public ModuleMark(Module module)
    {
        mark = 0;
        this.module = module;
    }
    
    /**
     * gives you mark
     */
    public int getValue()
    {
        return mark;
    }
    
    /**
     * If the mark is 40% or more then the 
     * student is awarded the module's credit.
     */
    public int getCredit()
    {
        if(mark <= Grades.F.getValue())
        {
            return 0;
        }
        else
        {
            return Module.CREDIT;
        }
    }
    
    /**
     * set the value of mark
     */
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    
    /**
     * gets the module
     */
    public Module getModule()
    {
        return module;
    }
    
    /**
     * Print the module details and any credit
     * that has been awarded.
     */
    public void print()
    {
        module.print();
        System.out.print("\t  " + getCredit() + "\t  " + mark);
    }
}
