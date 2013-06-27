package com.oz;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: asanchez
 * Date: 26/06/13
 * Time: 11:59 AM
 *
 * @author <a href="jaehoo@gmail.com">Alberto Sánchez</a>
 *         Contact me by:
 *         <ul><li>Twitter: @jaehoox</li><ul>
 */


public class DummyTestIT extends TestCase{

    private static final Logger logger= Logger.getLogger(DummyTestIT.class);

    @Test()
    public void testName() throws Exception {

        logger.info("My TEST!!!! ");


    }
}
