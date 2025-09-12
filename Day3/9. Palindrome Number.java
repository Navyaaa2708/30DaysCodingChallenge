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
//normal method and optimal
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(temp>0){
            int rem = temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return x==rev;
    }
}
