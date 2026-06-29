public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};

        int maxprofit=0;
        int bestbuy=price[0];

        for(int i=1;i<price.length;i++) {
            if(price[i]>bestbuy) {
                maxprofit=Math.max(maxprofit,price[i]-bestbuy);
            }
            bestbuy=Math.min(bestbuy,price[i]);
        }
        System.out.println("Max profit is: "+maxprofit);
    }
}