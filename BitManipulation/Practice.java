public class Practice {

    public static void main(String[] args) {

        // ==========================================================
        // Question 1: Value of x ^ x
        // ==========================================================
        int x = 13;
        System.out.println("Question 1");
        System.out.println("x = " + x);
        System.out.println("x ^ x = " + (x ^ x));
        System.out.println();

        // ==========================================================
        // Question 2: Swap Two Numbers Without Third Variable
        // ==========================================================
        int a = 5;
        int b = 9;

        System.out.println("Question 2");
        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        // ==========================================================
        // Question 3: Add 1 Using Bit Manipulation
        // ==========================================================
        int num = 25;
        int result = -(~num);

        System.out.println("Question 3");
        System.out.println("Original Number = " + num);
        System.out.println("After Adding 1 = " + result);
        System.out.println();

        // ==========================================================
        // Question 4: Convert Uppercase to Lowercase
        // ==========================================================
        char upper = 'A';
        char lower = (char) (upper | ' ');

        System.out.println("Question 4");
        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
        System.out.println();

        // ==========================================================
        // Bonus: Convert Lowercase to Uppercase
        // ==========================================================
        char small = 'z';
        char capital = (char) (small & '_');

        System.out.println("Bonus Question");
        System.out.println("Lowercase = " + small);
        System.out.println("Uppercase = " + capital);
    }
}