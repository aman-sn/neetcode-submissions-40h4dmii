class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] lProd = new int[len];
        int[] rProd = new int[len];
        int[] prod = new int[len];
        int mul =  1;
        for(int i = 0; i < len; i++){
            lProd[i] = mul;
            mul *= nums[i]; 
        }
        mul = 1;
        for(int i = len - 1; i >= 0; i--){
            rProd[i] = mul;
            mul *= nums[i];
        }
        for(int i = 0; i < len; i++){
            prod[i] = lProd[i] * rProd[i];
        }
        return prod;
    }
}  
