class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        int maxv=0;
        int maxc=0;
        for(char c:s.toCharArray())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                freq[c-'a']++;
                maxv=Math.max(maxv,freq[c-'a']);
            }
            else
            {
                freq[c-'a']++;
                maxc=Math.max(maxc,freq[c-'a']);
            }
        }
        return maxv+maxc;
    }
}