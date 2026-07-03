public class kokoeatingbananas {

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int answer = minEatingSpeed(piles, h);

        System.out.println("Minimum Eating Speed = " + answer);
    }

    // Binary Search
    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findMax(piles);

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int hours = calculateHours(piles, mid);

            if (hours <= h) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    // Calculate total hours needed at speed k
    public static int calculateHours(int[] piles, int k) {

        int totalHours = 0;

        for (int bananas : piles) {

            totalHours += (bananas + k - 1) / k;

            // Same as:
            // totalHours += Math.ceil((double) bananas / k);
        }

        return totalHours;
    }

    // Find maximum pile
    public static int findMax(int[] piles) {

        int max = piles[0];

        for (int bananas : piles) {
            if (bananas > max) {
                max = bananas;
            }
        }

        return max;
    }
}