public class kadans {
    public static void main(String[] args) {
        int[] nums={3,-4,5,4,-1,7};
        System.out.println("maxsum : "+ kadans(nums));
    }
    public static int kadans(int[] nums) {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++) {
            currentsum+=nums[i];
            maxsum=Math.max(maxsum, currentsum);

            if(currentsum<0) {
                currentsum=0;
            }
        }
        return maxsum;
    }
}