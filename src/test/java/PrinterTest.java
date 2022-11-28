import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    //run before each test ..update printer
    @Before
    public void before(){
        printer = new Printer();
    }
    @Test
    public void print(){
        assertEquals(20,printer.getPrint(10,2));
    }

}
