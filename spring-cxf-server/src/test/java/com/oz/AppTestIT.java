package com.oz;

//import junit.framework.Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.Logger;

/**
 * Unit test for simple App.
 */
public class AppTestIT
        extends TestCase
{

    private static final Logger logger = Logger.getLogger(AppTestIT.class);

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTestIT(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTestIT.class );
    }

    /**
     * Rigourous Test :-)
     */
    @org.junit.Test
    public void testApp()
    {
        System.out.println("ad");
        logger.info("======= IT TEST!!");


    }
}
