

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;






/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {



    @Test
    public void testIsTriangle(){
    assertTrue ( Demo.isTriangle(3,4,5));
    }

    @Test
    public void testIsTriangle1(){
        assertTrue ( Demo.isTriangle(5,12,13));
    }

    @Test
    public void testIsTriangle2(){
        assertTrue ( Demo.isTriangle(5,13,12));
    }

    @Test
    public void testIsTriangle3(){
        assertTrue ( Demo.isTriangle(12,5,13));
    }

    @Test
    public void testIsTriangle4(){
        assertTrue ( Demo.isTriangle(12,13,5));
    }

        @Test
    public void testIsNotTriangle(){
        assertFalse ( Demo.isTriangle(5,7,13));
    }

    @Test
    public void testIsNotTriangle2(){
        assertFalse ( Demo.isTriangle(5,13,7));
    }

    @Test
    public void testIsNotTriangle3(){
        assertFalse ( Demo.isTriangle(13,5,7));
    }

    @Test
    public void testIsNotTriangle4(){
        assertFalse ( Demo.isTriangle(13,7,5));
    }

    @Test
    public void testIsNotTriangle5(){
        assertFalse ( Demo.isTriangle(13,7,5));
    }

    @Test
    public void testIsNotTriangle6(){
        assertFalse ( Demo.isTriangle(5,9,3));
    }

    @Test
    public void testIsNotTriangle7(){
        assertFalse ( Demo.isTriangle(1,2,-1));
    }

    @Test
    public void test_main_program_1(){
        ByteArrayInputStream in = new ByteArrayInputStream(("5\n12\n13\n".getBytes()));
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is triangle.\n";

        assertEquals(consoleOutput, out.toString());
    }
}
