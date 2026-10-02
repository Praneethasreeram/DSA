class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        PriorityQueue<Map.Entry<String,Integer>> ans=new PriorityQueue<>((x,y)->{
           if(y.getValue()!=x.getValue())
           {
                 return y.getValue()-x.getValue();
           }
           return x.getKey().compareTo(y.getKey());
    });

        for(int i=0;i<words.length;i++)
        {
            if(!map.containsKey(words[i]))
            {
                map.put(words[i],1);
            }
            else
            {
                map.put(words[i],map.get(words[i])+1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            ans.offer(entry);
        }
        for(int i=0;i<k;i++)
        {
            if(!ans.isEmpty())
            {
              res.add(ans.poll().getKey());
            }
        }
        return res;
    }
}