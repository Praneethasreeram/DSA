class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder rev= new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder strb=new StringBuilder(arr[i]);
            if(i!=arr.length-1)
            {
            rev.append(strb.reverse()+" ");
            }
            else
            {
                rev.append(strb.reverse());
            }

        }
        String res= new String(rev);
        return res;
    }
}