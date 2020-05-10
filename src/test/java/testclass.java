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
    @Test
    public void testSub(){
        int a  = 20;
        int b = 10;
        int expected = 10;
        long result  = cal.sub(a,b);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testMul(){
        int a  = 10;
        int b = 20;
        int expected = 200;
        long result  = cal.mul(a,b);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testDiv(){
        double a  = 22;
        double b = 5;
        double expected = 4.4;
        double result  = cal.div(a,b);
        Assert.assertEquals(expected,result,0.00005);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        double a = 15;
        double b = 0;
        cal.div(a, b);
    }
}
