import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {

    @Test
    public void testCase1() {

    }


    @Test
    public void testCase2() {
        assertTrue(false);
    }

    @Test
    public void testCase3() {
        assertTrue(true);
    }
//
    @Test
    public void testCase4() {
        throw new RuntimeException();
    }

    @Test
    @Disabled
    public void testCase5(){

    }
}
