class Solution {
    public String longestDiverseString(int a, int b, int c) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('a',a);
        map.put('b',b);
        map.put('c',c);
        String res="";
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((x,y)->y.getValue()-x.getValue());
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>0)
            {
             pq.offer(entry);
            }
        }
        while(!pq.isEmpty())
        {
            Map.Entry<Character,Integer> max=pq.poll();
               if(res.length()<2 || (res.charAt(res.length()-1)!=max.getKey() 
               
               || res.charAt(res.length()-2)!=max.getKey() ))
                {
                    res+=max.getKey();
                    max.setValue(max.getValue()-1);
                    if(max.getValue()>0)
                    {
                        pq.offer(max);
                    }
                }
                else
                {
                    Map.Entry<Character,Integer> next=pq.poll();
                    if(next!=null)
                    {
                    res+=next.getKey();
                    next.setValue(next.getValue()-1);
                    if(next.getValue()>0)
                    {
                        pq.offer(next);
                    }
                    pq.offer(max);
                    }

                }
           
          
           }
            

        

        return res;
    }
}