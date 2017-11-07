package school;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by User on 07.11.2017.
 */
public class TestBag {
    Bag bag = new Bag(new Diary(), new Penal(null, null, Arrays.asList(new Pen())));

    @Test
    public void checkEraserIsNull() {
        Assert.assertNull(bag.getPenal().getEraser());
    }

    @Test
    public void checkRulerIsNull() {
        Assert.assertNull(bag.getPenal().getRuler());
    }

    @Test
    public void checkBagBear() {
        Assert.assertEquals("Bag.bear()", bag.bear());
    }

    @Test
    public void checkSetDiaryIsNull(){
        Assert.assertFalse(bag.getDiary() == null);
    }
}
