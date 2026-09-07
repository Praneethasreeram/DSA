class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map=new HashMap<>();
        ;
        if(score.length==1)
        {
            return new String[] {"Gold Medal"};
        }
        
        else
        {
            for(int i=0;i<score.length;i++)
        {
            map.put(score[i],i);
        }
            Arrays.sort(score);
            String res[]=new String[score.length];
            for(int i=res.length-1;i>=0;i--)
            {
                if(i==res.length-1)
                {
                    res[map.get(score[i])]="Gold Medal";
                }
                else if(i==res.length-2)
                {
                    res[map.get(score[i])]="Silver Medal";
                }
                else if(i==res.length-3)
                {
                    res[map.get(score[i])]="Bronze Medal";
                }
                else
                {
                    res[map.get(score[i])]=Integer.toString(score.length-i);
                }
            }
            return res;

    }
    }
}