import org.junit.*;

public class testclass {
    private Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
    }
    @Test
    public void testAdd(){
        int a  = 10;
        int b = 20;
        int expected = 30;
        long result  = cal.add(a,b);
        Assert.assertEquals(expected,result);
    }
}
