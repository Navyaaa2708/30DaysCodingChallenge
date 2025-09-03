class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> cnt=new Stack<>();
        for (char c:s.toCharArray()) {
            if (sb.length()>0 && sb.charAt(sb.length()-1)==c) {
                int count=cnt.pop()+1;
                if (count==k) sb.delete(sb.length()-k+1,sb.length());
                else{
                    cnt.push(count);
                    sb.append(c);
                }
            }else{
                sb.append(c);
                cnt.push(1);
            }
        }
        return sb.toString();
    }
}