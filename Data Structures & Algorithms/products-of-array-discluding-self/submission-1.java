class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int[] prefix=new int[l];
        int[] postfix=new int[l];
        int[] output=new int[l];
        int m=1;
        for(int i=0;i<l;i++){
            m*=nums[i];
            prefix[i]=m;
        }
        m=1;
        for(int i=l-1;i>=0;i--){
            m*=nums[i];
            postfix[i]=m;
        }
        output[0]=postfix[1];
        output[l-1]=prefix[l-2];
        for(int i=1;i<l-1;i++){
            output[i]=prefix[i-1]*postfix[i+1];
        }
        return output;
    }
}  
