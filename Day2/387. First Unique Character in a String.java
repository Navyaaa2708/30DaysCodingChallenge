class Solution {
    public int firstUniqChar(String s) {
        int[] hash=new int[26];
        for(char c:s.toCharArray()){
            hash[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(hash[s.charAt(i)-'a']==1){
                return i;
            }
        } return -1;
    }
}