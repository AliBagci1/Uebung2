package test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import daten.Student;

public class StudentTest {
	
	private Student s1;
    private Student s2;
    private Student s3;
    private Student s4; 
    private Student s5; 
   
    private ArrayList<Student> sArray = new ArrayList<Student>();
    private ArrayList<Student> sSort = new ArrayList<Student>();
    
    @Before
    public void setUp() throws Exception {
            s1 = new Student("Ali", "Bagci");
            s2 = new Student("Onur", "Tuncel");
            s3 = new Student("Mustafa", "Asrak");
            s4 = new Student("Philip", "Steini");
            s5 = new Student("Max", "Muster");
            s1.setDate(new Date(93,12,07));
            s2.setDate(new Date(94,03,07)); 
            s3.setDate(new Date(96,01,04));
            s4.setDate(new Date(90,12,01));
            s5.setDate(new Date(96,05,26));
            
            sArray.add(s1);
            sArray.add(s2);
            sArray.add(s3);
            sArray.add(s4);
            sArray.add(s5);
            
            sSort.add(s1);
            sSort.add(s2);
            sSort.add(s3);
            sSort.add(s4);
            sSort.add(s5);
           
    }

    
    @Test
    public void toStringTest() {
            
            assertEquals("Student {firstName=Ali, lastName=Bagci} - 07.12.93",s1.toString());
    }
    @Test
    public void compareToTest() {
            
            assertEquals(-1, s1.compareTo(s2));
            assertEquals(0, s1.compareTo(s3));
    }
    
    @Test
    public void sortByDateTest() {
            assertEquals(sSort, s1.sortByDate(sArray));
    }

	

}
