public class FastExponentiationn {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 13;

        System.out.println(power(base, exponent));
    }

    public static long power(long base, int exponent) {
        long result = 1;

        while (exponent > 0) {

            if ((exponent & 1) == 1) {
                result *= base;
            }

            base *= base;
            exponent >>= 1;
        }

        return result;
    }
}

