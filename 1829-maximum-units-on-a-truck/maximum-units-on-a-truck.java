class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->a[1]-b[1]);
        int index=boxTypes.length-1;
        int res=0;
        while(index>=0 && truckSize!=0)
        {
            if(boxTypes[index][0]<=truckSize)
            {
              truckSize-=boxTypes[index][0];
              res+=boxTypes[index][0]*boxTypes[index][1];
            }
            else 
            {
                int boxNum=boxTypes[index][0];
                while(boxNum!=0 && truckSize!=0)
                {
                    boxNum--;
                    truckSize--;
                    res+=boxTypes[index][1];
                }
            }
            index--;
        }
        return res;
        
    }
}