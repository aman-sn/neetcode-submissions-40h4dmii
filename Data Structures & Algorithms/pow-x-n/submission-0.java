class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        return 1.0;
        if(n>0)
        return x*myPow(x,n-1);
        return 1/myPow(x,n*-1);
    }
}
