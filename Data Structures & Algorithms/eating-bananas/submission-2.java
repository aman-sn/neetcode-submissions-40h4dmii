class Solution {
    public boolean canEat(int k, int h, int[] piles){
        int timeTaken = 0;
        for(int i = 0; i < piles.length; i++){
            timeTaken += Math.ceil((double) piles[i] / k);
        }
        return timeTaken <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = java.util.Arrays.stream(piles).max().getAsInt();
        int result = r;
        while(l <= r){
            int k = l + (r-l) / 2;
            if(canEat(k, h, piles)){
                result = Math.min(result, k);
                r = k - 1;
            }
            else{
                l = k + 1;
            }
        }
        return result;
    }
}
