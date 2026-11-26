class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
       
        StringBuilder res=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i!=0)
           {
            res.append(arr[i]+" ");
           }
           else
           {
            res.append(arr[i]);
           }
        }
        String newres=new String(res);
        return newres;
    }
}