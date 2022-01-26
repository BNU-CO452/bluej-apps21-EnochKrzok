import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day and Enoch Jozue Krzok
 * @version 2.0 20/10/2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    // makes a array list for student
    public ArrayList<Student> students;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
    
    /**
     * This constructor creates a new course with a
     * fixed code and title. 
     */
    public Course()
    {
        this("BB1ARI1", "BSc Artificial Intelligence");
    }
    
        /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
        
        students = new ArrayList<Student>();
        
        createStudents();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
        Module co450 = new Module("CO450" , "Computer Architectures           ");
        Module co407 = new Module("CO407" , "Essentials Of Intelligent Systems");
        Module co452 = new Module("CO452" , "Programming Concepts             ");
        Module co456 = new Module("CO456" , "Web Development                  ");
        addModule(co450);
        addModule(co407);
        addModule(co452);
        addModule(co456);
    }
    
    /**
     * Adds module to the list if there is less modules already created 
     * then max modules
     */
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /**
     * Create students to add to array list students 
     * Hard code into proggram
     */
    public void createStudents()
    {
        
    }
    
    /**
     * Adds student to the list
     */
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    /**
     * makes it so you get a grade dased on the marks you got
     */
    public Grades convertToGrade(int mark)
    {
        if(mark <= 0) 
            return Grades.NS;
        else if (mark <= 39)
            return Grades.F;
        else if (mark <= 49)
            return Grades.D;
        else if (mark <= 59)
            return Grades.C;
        else if (mark <= 69)
            return Grades.B;
        else if (mark <= 100)
            return Grades.A;
        else
            return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        for(ModuleMark mark : marks)
        {
            total = total + mark.getValue();
        }
        finalMark = total / 4;
        finalGrade = convertToGrade(finalMark);
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
        System.out.println();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        for(Module module : modules)
        {
            module.print();
            module.printCredit();
        }
    }
    
    /**
     * Print the course's four modules
     */
    public void printStudents()
    {
        this.print();
        System.out.println();
        for(Student student : students)
        {
            student.print();
        }
    }
}
