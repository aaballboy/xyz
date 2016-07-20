package test.sqa.maven_demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {
	private Demo t;
    @Before
    public void setup(){
    	t = new Demo();
    }
    
    @Test
    public void testD(){
    	String s1 = "aa";
    	String s2 = "aab";
    	assertEquals("b",t.getDiff(s1, s2));
    }

}
