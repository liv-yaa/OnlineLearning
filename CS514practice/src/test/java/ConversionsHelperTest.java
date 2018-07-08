import org.junit.Assert;
import org.junit.Test;


public class ConversionsHelperTest {

    @Test
    public void t1() {
        double v = ConversionsHelper.ouncesToGallons(128);
        Assert.assertEquals("",1.0, v,0.005);
    }

    @Test
    public void t2() {
        double w = ConversionsHelper.cmToFeet((int) 30.48);
        Assert.assertEquals("",1, w,0.005);
    }

}