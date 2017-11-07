package school;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 07.11.2017.
 */
public class TestDiary {
    Diary diary = new Diary();

    @Test
    public void checkLastRead(){
        diary.setLastRead("U r flawless");
        Assert.assertEquals(diary.read(), "U r flawless");
    }

    @Test
    public void checkLastKudos(){
        diary.setLastKudos("Good job");
        Assert.assertEquals(diary.getLastKudos(), "Good job");
    }

    @Test
    public void checkLastCallDown(){
        diary.setLastCallDown("Don't interrupt");
        Assert.assertEquals(diary.getLastCallDown(), "Don't interrupt");
    }

    @Test
    public void checkStickers(){
        Assert.assertFalse(diary.hasStickers());
    }

    @Test
    public void checkHasStickers(){
        diary.setStickers(true);
        Assert.assertTrue(diary.hasStickers());
    }

    @Test
    public void checkTire(){
        Assert.assertFalse(diary.isTire());
    }

    @Test
    public void checkIsTire(){
        diary.setTire(true);
        Assert.assertTrue(diary.isTire());
    }

    @Test
    public void checkBlur(){
        Assert.assertFalse(diary.isBlurt());
    }

    @Test
    public void checkIsBlurt(){
        diary.setBlur(true);
        Assert.assertTrue(diary.isBlurt());
    }
}
