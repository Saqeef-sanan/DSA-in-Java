
import java.util.HashMap;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] nums= {9,4,20,3,10,5};
        int k=33;

        int result = subarraySum(nums,k);
        System.out.println("count "+result);
    }
    public static int subarraySum(int[] nums,int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int num : nums) {
            prefixsum+=num;
            if(map.containsKey(prefixsum-k)) {
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}
