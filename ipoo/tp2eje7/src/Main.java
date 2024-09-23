import java.math.BigInteger;

public class Main {
        public static void main(String[] args) {
            System.out.println(factorial( BigInteger.valueOf(200)));
        }
        public static BigInteger factorial(BigInteger n) {
            if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE) ) {
                return BigInteger.ONE;
            }else{
                return n.multiply(factorial(n.subtract(BigInteger.ONE)));
            }
        }
}
