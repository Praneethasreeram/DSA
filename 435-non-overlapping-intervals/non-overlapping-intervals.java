class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //int count=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int prevs=intervals[0][0];

        int preve=intervals[0][1];
        int start=0;
        int i=0;
        int count=0;
        int starte=0;
        while(i<intervals.length-1)
        {
           
            start=intervals[i+1][0];
            starte=intervals[i+1][1];
            if(prevs==start || start<preve )
            {
                count++;
               
             
            }
            else
            {
                prevs=start;
                preve=starte;

            }
            
            i++;
        }
        return count;
    }
}