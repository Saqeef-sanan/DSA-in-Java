public class ithBit {
    public static void main(String[] args) {
        int number = 5;
        int bitmask = 1 << 2; 
        
        //get ith bit
        if ((number & bitmask) != 0) {
            System.out.println("The 2nd bit of " + number + " is 1.");
        } else {
            System.out.println("The 2nd bit of " + number + " is 0.");
        }

        //set ith bit
        int result = number | bitmask;
        System.out.println("After setting the 2nd bit, the new number is: " + result);

        //clear ith bit
        result = number & ~bitmask;
        System.out.println("After clearing the 2nd bit, the new number is: " + result);

        //clear last i bits
        int i = 2;  
        result = number & (~0 << i);
        System.out.println("After clearing the last " + i + " bits, the new number is: " + result);

        //clear range of bits from i to j
        i = 1;
        int j = 3;
        int a = (~0 << (j + 1));
        int b = (1 << i) - 1;
        result = number & (a | b);
        System.out.println("After clearing the range of bits from " + i + " to " + j + ", the new number is: " + result);
    }
}