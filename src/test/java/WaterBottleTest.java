import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }
    @Test
    public void drink(){
        assertEquals(90,waterBottle.getDrink());
    }
    @Test
    public  void getEmpty(){
        assertEquals(0,waterBottle.getEmpty());
    }
    @Test
    public  void getFull(){
        assertEquals(100,waterBottle.getFull());
    }
}
