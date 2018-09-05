public class Palindrome_Number {

    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int a=x;
        int b=0;
        while (a>0)
        {
            b = b*10+a%10;
            a = a/10;
        }
        return x == b;
    }
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(122221));
    }
}
