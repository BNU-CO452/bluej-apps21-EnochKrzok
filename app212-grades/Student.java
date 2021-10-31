import java.util.*;
//adds the random function
import java.util.Random;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * Modified by Derek Peacock & Nicholas Day and Enoch Jozue Krzok
 * @version 2.0 20/10/2021
 */
public class Student
{
    // the student ID
    private int id;
    // the student's full name
    private String name;
    // The course the student is enrolled on
    private Course course;
    // The marks awarded for the modules on the course
    private ArrayList<ModuleMark> marks;
    // So i can use diffrent marks
    private Random randomMark;
    
    /**
     * This constructor creates a new student with a
     * fixed name and id. 
     */
    public Student()
    {
        this("Enoch Jozue Krzok", 22140200);
    }
    
    /**
     * Create a new student with a given name and ID number.
     *  And create a random number generater
     */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        randomMark = new Random();
        marks = new ArrayList<ModuleMark>();
    }
    
    /**
     * adds a mark to the list
     */
    public void addMark(ModuleMark mark)
    {
        marks.add(mark);
    }
    
    /**
     * Find the module by the moduleCode and
     * set its mark to the value
     */
    public void awardMark(String moduleCode, int value)
    {
        
    }
    
    /**
     * Set the student's course
     */
    public void enrol(Course course)
    {
        this.course = course;
        awardTestMarks();
    }
    
    /**
     * Award a different pass mark for each of the
     * modules on the enrolled course
     */
    public void awardTestMarks()
    {
        for(Module module : course.modules)
        {
            ModuleMark mark = new ModuleMark(module);
            mark.setMark(randomMark.nextInt(100));
            addMark(mark);
        }
    }
    
    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the student ID of this student.
     */
    public int getID()
    {
        return id;
    }

        
    /**
     * Print the student's name and ID number to the 
     * output terminal.
     */
    public void print()
    {
        System.out.println(" Student ID: " + id + ", Student name:  " + name);
    }
    
    /**
     * Print the student's course 
     */
    public void printCourse()
    {
        this.print();
        course.print();
    }
    
    /**
     * Print the student's grade 
     */
    private void printModules()
    {
        for(ModuleMark mark : marks)
        {
            mark.print();
            System.out.println("\t   " + course.convertToGrade(mark.getValue()));
        }
    }
    
    /**
     * Print the student's course (whats in the course and max credits),
     * modules, marks, credits, grades and final grade
     */
    public void printTranscript()
    {
        System.out.println(" ------------------------------------");
        System.out.println(" App21-02: Exam Board Transcript 2021");
        System.out.println("        by Enoch Jozue Krzok");
        System.out.println(" ------------------------------------");
        
        printCourse();
        
        System.out.println();
        System.out.println();
        System.out.println(" ---- \t --------------------------------- \t------\t ---- \t -----");
        System.out.println(" Code \t Module \t\t\t\tCredit\t Mark \t Grade");
        System.out.println(" ---- \t --------------------------------- \t------\t ---- \t -----");
        
        printModules();
       
        Grades finalGrade = course.calculateGrade(marks);
        
        System.out.println();
        System.out.println();
        
        if(finalGrade == Grades.NS)
        {
            System.out.println(" No Final Course Grade Yet!");
        }
        else
        {
            System.out.println(" Final Course Grade = " + finalGrade);
        }
    }
}