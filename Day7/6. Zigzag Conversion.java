class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)  return s;
        StringBuilder[] rows=new StringBuilder[Math.min(numRows,s.length())];
        for(int i=0;i<rows.length;i++)  rows[i]=new StringBuilder();
        int curr=0; boolean down=false;
        for(char c:s.toCharArray()){
            rows[curr].append(c);
            if(curr==0||curr==numRows-1)    down=!down;
            curr+=down?1:-1;
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder row:rows)  ans.append(row);
        return ans.toString();
    }
}