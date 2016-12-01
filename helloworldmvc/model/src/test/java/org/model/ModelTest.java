package org.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ModelTest extends TestCase
{
	private Model model;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ModelTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(ModelTest.class);
    }
    
	public void setUp() throws Exception {
		this.model = new Model();
	}
    
	public void testGetHelloWorld() {
		assertEquals("Hello World", this.model.getHelloWorld());
	}

}
