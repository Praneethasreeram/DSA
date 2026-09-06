class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++)
        {
            char ch=chars.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
               else
               {
                map.put(ch,map.get(ch)+1);
               }
        }
        int count=0;
        int totalLength=0;
     for(int i=0;i<words.length;i++)
     {
        count=0;
        Map<Character,Integer> temp=new HashMap<>(map);
        for(int j=0;j<words[i].length();j++)
        {
            char ch=words[i].charAt(j);
            if(temp.containsKey(ch))
            {
                if(temp.get(ch)>0)
                {
                    temp.put(ch,temp.get(ch)-1);
                    count++;
                }
                else
                {
                    break;
                }
            }
            else
            {
                break;
            }
        }
        if(count==words[i].length())
        {
           totalLength+=count;
        }
 
     }
     return totalLength;   
    }
}