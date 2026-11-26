class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int arrR[]=new int[26];
         int arrM[]=new int[26];
         char ransome[]=ransomNote.toCharArray();
         char mag[]=magazine.toCharArray();
         for(int i=0;i<ransome.length;i++)
         {
            char ch=ransome[i];
            arrR[ch-'a']++;
         }
          for(int i=0;i<mag.length;i++)
         {
            char ch=mag[i];
            arrM[ch-'a']++;
         }
         for(int i=0;i<26;i++)
         {
            if(arrM[i]>=arrR[i])
            {

            }
            else
            {
                return false;
            }
         }
         return true;



        
    }
}