class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int j = 0;
        int ans = 0;
        int maxFreq = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            freq[ch -'A']++;

            maxFreq = Math.max(maxFreq,freq[ch-'A']);

            int window = i - j + 1;

            if(window - maxFreq > k){
                freq[s.charAt(j) - 'A']--;
                j++;
            }

            window = i - j + 1;
            ans = Math.max(window,ans);
        }
        return ans;
        
        // int n = s.length();
        // int ans = 0;
        // int i = 0;
        // int j = 0;
        // int count = 0;
        // while(j < n){
        //     char ch = s.charAt(j);
        //     if(ch != s.charAt(i)){
        //         count++;
        //         ans = Math.max(ans,j-i);
        //         while(count > k){
        //             if(ch != s.charAt(i)){
        //                 count--;
        //             }
        //             i++;
        //         }
        //     }
        //     j++;
        // }

        // ans = Math.max(ans,n-i);
        // return ans;
    }
}