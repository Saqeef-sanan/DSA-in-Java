public class countSetbit {
    public static void main(String[] args) {
        int number = 28; // Example number
        int count = 0;

        // Count the number of set bits
        while (number > 0) {
            if((number & 1) == 1) {
                count++;
            }
            number >>= 1; // Right shift the number by 1
        }

        //method 2 --> Brian Kernighan's Algorithm
        // int count = 0;
        // while (number > 0) {
        //     number = number & (number - 1);
        //     count++;
        // }

        System.out.println("The number of set bits is: " + count);
    }
}
