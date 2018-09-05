

public class Reverse_Integer {


    public int reverse(int x) {
//        long result=0;
//        long temp;
//        int length;
//        boolean tag;
//        tag= x > 0;
//        if(tag)
//        {
//            temp=x;
//            length= Integer.toString(x).length();
//        }
//        else
//        {
//            length=Integer.toString(x).length()-1;
//            temp=-x;
//        }
//        for(int i=0,j=length;i<length;i++)
//        {
//            long num=temp%10;
//            result=num*((long)Math.pow(10,j-1))+result;
//            if(result>=Integer.MAX_VALUE||result<=Integer.MIN_VALUE)
//                return 0;
//            temp=temp/10;
//            j--;
//        }
//        result=tag?result:-result;
//        return (int)result;

        int a = Math.abs(x);
        long b = 0;
        while(a>0){
            b = b*10+a%10;
            a = a/10;
        }
        if(x<0){
            b=-b;
        }
        if(b>Integer.MAX_VALUE||b<Integer.MIN_VALUE){
            return 0;
        }
        return (int)b;
    }

}
