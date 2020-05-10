public class Calculator {


    public static void main(String[] args) {
            System.out.println("Add 5 and 6 => " + add(5, 6));
            System.out.println("Subtract 20 and 10 ==> " + sub(20,10));
            System.out.println("Multiply 10 *20 ==> " + mul(10,20));
            System.out.println("Divide 6 with 2 ==>" + div(6,2));
    }
    static int add(int x,int y){
        return x+y;
    }
    static int sub(int x,int y) { return x-y; }
    static int mul(int x, int y){ return x*y; }
    static double div(double x,double y) {
        double res;
        if(y==0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        else {
            res = x/y;
        }
        return res;
    }
}
