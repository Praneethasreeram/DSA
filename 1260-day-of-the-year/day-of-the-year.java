class Solution {
    public int dayOfYear(String date) {
        String arr[]=date.split("-");
        int month=Integer.parseInt(arr[1]);
        int day =Integer.parseInt(arr[2]);
        int year=Integer.parseInt(arr[0]);
        int orgMonth=month;
        int res=0;
        boolean isLeap=(year%4==0 && year%100!=0) || (year%400==0);
        if(month==1)
        {
            res= day;
        }
        else
        {
             month=month-1;
             while(month!=0)
             {
                day+=monthDays(month);
                month--;
             }
             res= day;

        }
        if(orgMonth>2 && isLeap)
        {
            res+=1;
        }
        return res;
        
    }
    public int monthDays(int month)
    {
        switch(month)
        {
            case 1:return 31;
            case 2:return 28;
            case 3:return 31;
            case 4:return 30;
            case 5:return 31;
            case 6:return 30;
            case 7:return 31;
            case 8:return 31;
            case 9:return 30;
            case 10:return 31;
            case 11:return 30;
            case 12:return 31;
            default:return 0;
        }
    }
}