class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long[] arr = new long[n * (n + 1) / 2];
        int k=0;
        for(int i=0; i<n; i++){
            long sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                arr[k++] = sum;
            }
        }
        Arrays.sort(arr);
        long MOD = 1_000_000_007;
        long result = 0;
        
        for (int i = left - 1; i < right; i++) {
            result = (result + arr[i]) % MOD;
        }
        return (int) result;
        
    }
}