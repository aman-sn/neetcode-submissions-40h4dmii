class Solution {
    private Map<Integer, Integer> memo=new HashMap<>();
    public int climbStairs(int n) {
        if(memo.containsKey(n)) return memo.get(n);
        if(n==0||n==1)
        return 1;
        int result=climbStairs(n-1)+climbStairs(n-2);
        memo.put(n,result);
        return result;
    }
}
