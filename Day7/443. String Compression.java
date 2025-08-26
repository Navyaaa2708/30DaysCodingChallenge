class Solution {
    public int compress(char[] chars) {
        int n=chars.length,k=0,i=0;
        while(i<n){
            char c=chars[i];
            int j=i;
            while(j<n&&chars[j]==c) j++;
            chars[k++]=c;
            int cnt=j-i;
            if(cnt>1){
                for(char ch:String.valueOf(cnt).toCharArray()){
                    chars[k++]=ch;
                }
            }
            i=j;
        }
        return k;
    }
}