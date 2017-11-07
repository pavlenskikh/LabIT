package school;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by User on 07.11.2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TestBag.class, TestDiary.class, TestPenal.class, TestPencil.class, TestRuler.class}
)
public class AllTests {
}
