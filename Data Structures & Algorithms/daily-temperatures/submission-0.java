class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i = 0; i < n - 1 ; i++){
            int j = i + 1;
            while(j < n && temperatures[j] <= temperatures[i]){
                j++;
            }
            if (j < n) {
                result[i] = j - i;
            }
        }
        return result;
    }
}
