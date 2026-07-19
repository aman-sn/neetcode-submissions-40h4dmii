class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m - 1;
        while(l <= r){
            int mid = l + (r-l) / 2;
            if(matrix[mid][0] <= target && matrix[mid][n-1] >= target){
                int i = 0, j = n - 1;
                while(i <= j){
                    int nid = i + (j-i)/2;
                    if(matrix[mid][nid] == target)
                        return true;
                    else if(matrix[mid][nid] > target)
                        j = nid - 1;
                    else if(matrix[mid][nid] < target)
                        i = nid + 1;
                }
                return false;
            }
            else if(matrix[mid][0] > target)
                r = mid - 1;
            else if(matrix[mid][n - 1] < target)
                l = mid + 1;
        }
        return false;
    }
}
