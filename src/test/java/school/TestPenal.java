package school;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 07.11.2017.
 */
public class TestPenal {
    Eraser eraser = new Eraser(true, false);
    Ruler ruler = new Ruler(30);
    ArrayList<Writable> writables = new ArrayList<Writable>(Arrays.asList(
            new Pen(),
            new Pencil(false, true, "squirrel")
    ));
    Penal penal = new Penal(eraser, ruler, writables);

    @Test
    public void checkWritablesNotNull(){
        Assert.assertNotNull(penal.getWritables());
    }

    @Test
    public void checkPenWrite(){
        Assert.assertEquals("Pen's written the same", penal.getWritables().get(0).write("the same"));
    }

    @Test
    public void checkPencilWrite(){
        Assert.assertEquals("Pencil's written the same", penal.getWritables().get(1).write("the same"));
    }

    @Test
    public void checkEraserErase(){
        Assert.assertEquals(penal.getEraser().erase(), "Eraser.erase()" );
    }

    @Test
    public void checkEraserIsLost(){
        Assert.assertFalse(penal.getEraser().isLost());
    }

    @Test
    public void checkEraserIsDropped(){
        Assert.assertTrue(penal.getEraser().isDropped());
    }

    @Test
    public void checkSetEraserIsNull(){
        penal.setEraser(null);
        Assert.assertNull(penal.getEraser());
    }

    @Test
    public void checkGetRulerLength(){
        Assert.assertTrue(penal.getRuler().measure() < 100);
    }
}
