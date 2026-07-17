public class bitwiseOperations {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Bitwise AND  
        System.out.println("a & b = " + (a & b));
        // Bitwise OR
        System.out.println("a | b = " + (a | b));
        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));
        // Bitwise NOT
        System.out.println("~a = " + (~a));
        // Left Shift
        System.out.println("a << 1 = " + (a << 1));
        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); 
    }
}
