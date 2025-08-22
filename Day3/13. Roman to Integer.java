//using hashmap
class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        int num=0;  
         for (int i = 0; i < s.length(); i++) {
            String curr = String.valueOf(s.charAt(i));
            if (i < s.length() - 1) {
                String next = String.valueOf(s.charAt(i + 1));
                if (roman.get(curr) < roman.get(next)) {
                    num -= roman.get(curr);
                    continue;
                }
            }
            num += roman.get(curr);
        }
        return num;
    }
}
//using switch
class Solution {
    public int romanToInt(String s) {
        int num=0;
        int prev=0;
        for(int i=s.length()-1; i>=0; i--){
            int val=roman(s.charAt(i));
            if(val<prev){
                num-=val;
            }else{
                num+=val;
            }
            prev=val;
        }
        return num;
    }
    public int roman(int ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}