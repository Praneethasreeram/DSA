class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gLen=g.length;
        int sLen=s.length;
        int count=0;
        int ptrG=0;
        int ptrS=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(ptrG<gLen && ptrS<sLen)
        {
            if(s[ptrS]>=g[ptrG])
            {
                count++;
                ptrG++;
                ptrS++;
            }
            else
            {
                ptrS++;
            }
        }



        
        return count;
        
    }
}