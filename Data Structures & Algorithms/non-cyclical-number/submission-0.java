class Solution {
    public boolean isHappy(int n) {
        int sum=sumOfSquares(n);
        return sum==1?true:sum/10==0?false:isHappy(sum);
    }
    public int sumOfSquares(int n){
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
            System.out.println(sum);}
        return sum;
    }
}
