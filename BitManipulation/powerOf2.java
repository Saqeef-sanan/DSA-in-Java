public class powerOf2 {
    public static void main(String[] args) {
        int number = 16;

        // Check if the number is a power of 2
        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
    
}
