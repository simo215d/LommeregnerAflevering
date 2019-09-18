import junit.framework.TestCase;

public class LommeregnerTest extends TestCase {
    Lommeregner calc = new Lommeregner();
    public void testSum(){
        assertEquals(6,calc.sum(2,4));
    }
    public void testSub(){
        assertEquals(1,calc.sub(3,2));
    }
    public void testMul(){
        assertEquals(12,calc.mul(2,6));
    }
    public void testDiv(){
        assertEquals(2,calc.div(10,5));
    }

    public void testWeird(){
        assertEquals(25.0,calc.weird(5,2));
    }
}