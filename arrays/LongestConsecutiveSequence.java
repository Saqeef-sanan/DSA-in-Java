import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr= {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        
        if(arr.length==0) {
            System.out.println("longest count: 0");
            return;
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int longest=1;
        int count=1;

        for(int i=1; i<arr.length; i++) {
            if(arr[i]==arr[i-1]+1) {
                count++;
            }
            else if(arr[i]!=arr[i-1]) {
                count=1;
            }
            
            longest=Math.max(longest, count);
        }
        System.out.println("longest count: "+longest);
    }
}