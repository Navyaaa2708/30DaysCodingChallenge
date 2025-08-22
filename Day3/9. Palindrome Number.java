//using conversion to string
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s=String.valueOf(x);
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
//normal method
class Solution{
    public boolean isPalindrome(int x){
        if(x<0)return false;
        int temp=x,rev=0;
        while(x!=0){
            int rem=x%10;
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&rem>7))return false;
            if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&rem<-8))return false;
            rev=rev*10+rem;
            x/=10;
        }
        return rev==temp;
    }
}
