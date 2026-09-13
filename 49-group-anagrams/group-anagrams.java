class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> map=new HashMap<>();
        List<List<String>> MainLst=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(!map.containsKey(sorted))
            {
                List<String> subList=new ArrayList<>();
                map.put(sorted,i);
                subList.add(strs[i]);
                MainLst.add(subList);
                
            }
            else
            {
                for(int j=0;j<MainLst.size();j++)
                {
                    if(MainLst.get(j).contains(strs[map.get(sorted)]))
                    {
                        MainLst.get(j).add(strs[i]);
                    }
                }
            }
        }
        return MainLst;
    }
}