//Brute
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
// TC- O(n)
// SC - O(n) -> this needs to be eliminated

//optimal 
// Here we can eliminate that extra space
class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}
