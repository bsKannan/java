
public class Factorial {
    public static void main(String args[]) {
        int num = 10;
        long factorial = 1;
        
        for (int i = 1;i<=num;i++) {
            factorial *=i;
        }
        System.out.printf("Factorial of %d = %d", num , factorial);
    }
}




BigInteger is using for max values:
import java.math.BigInteger;
public class Factorial {
    public static void main(String args[]) {
        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        
        for(int i =1;i<=num;i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d ", num,factorial);
    }
}
