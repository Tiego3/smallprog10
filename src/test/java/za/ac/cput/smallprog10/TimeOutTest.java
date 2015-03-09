package za.ac.cput.smallprog10;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TimeOutTest extends TestCase{
    @Test(timeout = 11)

    public void TimeTest()throws Exception {
       // TimeOutProg tm = new TimeOutProg();
        while(true);
    }
}
