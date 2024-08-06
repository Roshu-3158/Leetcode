class Solution {
    public int minimumPushes(String word) {
        // calculating freq
        int arr[] = new int[26];
        for(char ch: word.toCharArray()){
            arr[ch-'a']++;
        }

        // sort in decreasing order
        Arrays.sort(arr);
        int count = 0;
        int minkeypress = 0;

        // iterate reverse
        for(int i=25; i>=0; i--){
            if(arr[i]==0){
                break;
            }
            int mul=0;
            int value = arr[i] * (count/8 +1);
            minkeypress +=value;
            count++;

        }
        return minkeypress;
    }
}