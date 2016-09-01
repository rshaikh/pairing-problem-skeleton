import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Solution {
    static final BigInteger NUMBER_1000000 = BigInteger.valueOf(1000000);
    static final NumberFormat SIX_DIGITS = new DecimalFormat("000000");

    public int solution(int N) {

        int lastNoInSeries = 0;
        if (N == 0) {
            lastNoInSeries = 0;
        } else if (N == 1) {
            lastNoInSeries = 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 1; i < N; i++) {
                lastNoInSeries = a + b;
                a = b;
                b = lastNoInSeries;
            }
        }


        BigInteger number = BigInteger.valueOf(lastNoInSeries);

        BigInteger result = number.remainder(NUMBER_1000000);
        String format = SIX_DIGITS.format(result);

        return Integer.valueOf(format);

    }
}
