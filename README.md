# September13_2025
The problem that i solved today in leetcode

You are given a string s consisting of lowercase English letters ('a' to 'z').

Your task is to:

Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.

Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

The frequency of a letter x is the number of times it occurs in the string.

Code:
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
