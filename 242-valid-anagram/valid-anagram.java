class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        char chs[]=s.toCharArray();
        char cht[]=t.toCharArray();
        for(int i=0;i<s.length();i++)
        {
           char ch=chs[i];
           arr1[ch-'a']++;
        }
         for(int i=0;i<t.length();i++)
        {
           char ch=cht[i];
           arr2[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}