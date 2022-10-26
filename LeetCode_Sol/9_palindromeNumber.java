// 9. Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse=0; 
        int y=x;
        while(y>0){
            int n=y%10;
            reverse=reverse*10+n;
            y=y/10;
        }
        if(reverse==x)
            return true;
        else 
            return false;
        
    }
}
