package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JobTest {
    private Job job1,job2,job3,job4;
    @Before
    public void testObjects(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId(){

        assertEquals(job1.getId(), job2.getId(),1);

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester",job3.getName());
        assertEquals("ACME",job3.getEmployer().getValue());
        assertEquals("Desert",job3.getLocation().getValue());
        assertEquals("Quality control",job3.getPositionType().getValue());
        assertEquals("Persistence",job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job1.equals(job2));


    }
@Test
    public void TestForBlankLineToString(){
        char firstChar = job3.toString().charAt(0);
        char lastChar = job3.toString().charAt(job3.toString().length()-1);
        assertEquals('\n', job3.toString().charAt(0));
    //assertEquals('\n', job3.toString().charAt(job3.toString().length()-1));
    System.out.println(lastChar);
}
@Test
    public void TestForLabelAndDataToString(){
        String output = String.format("\nID: %d" + "\nName: %s" + "\nEmployer: %s"+"\nLocation: %s"+"\nPositionType: %s"+"\nCoreCompetency: %s\n",job3.getId(),job3.getName(),job3.getEmployer().getValue(),job3.getLocation().getValue(),job3.getPositionType().getValue(),job3.getCoreCompetency().getValue());
    System.out.println(job3.toString());
    assertEquals(output,job3.toString());

    }
@Test
    public void TestForEmptyFieldToString(){

job3.getEmployer().setValue("");
job3.getLocation().setValue("");
    String output = String.format("\nID: %d" + "\nName: %s" + "\nEmployer: %sData not available"+"\nLocation: %sData not available"+"\nPositionType: %s"
            +"\nCoreCompetency: %s\n",job3.getId(),job3.getName(),job3.getEmployer().getValue(),job3.getLocation().getValue(),job3.getPositionType().getValue(),job3.getCoreCompetency().getValue());

    //String output = String.format("\nID: %d" + "\nName: %s" + "\nEmployer: Data not available"+"\nLocation: Data not available"+"\nPositionType: %s"
           // +"\nCoreCompetency: %s \n",job3.getId(),job3.getName(),job3.getEmployer().getValue(),job3.getLocation().getValue(),job3.getPositionType().getValue(),job3.getCoreCompetency().getValue());
    //System.out.println(job3.toString());
    assertEquals(output,job3.toString());
}
}
