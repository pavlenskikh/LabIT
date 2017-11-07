package school;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 07.11.2017.
 */
public class TestPencil {
    Pencil pencil = new Pencil(true, false, "flower");

    @Test
    public void CheckHasEraser(){
        pencil.setHasEraser(false);
        Assert.assertFalse(pencil.hasEraser());
    }

    @Test
    public void CheckIsBroken(){
        Assert.assertFalse(pencil.isBroken());
    }

    @Test
    public void CheckLastWritten(){
        pencil.write("My string");
        Assert.assertEquals("Pencil's written My string", pencil.getLastWritten());
    }

    @Test
    public void CheckLastDrown(){
        Assert.assertFalse(pencil.getLastDrawn().equals("Flower"));
    }

}
