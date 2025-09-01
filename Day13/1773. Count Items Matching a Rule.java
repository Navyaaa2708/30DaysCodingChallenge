class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx,cnt=0;
        if(ruleKey.equals("color"))    idx=1;
        else if(ruleKey.equals("type")) idx=0;
        else idx=2;
        for(int i=0;i<items.size();i++)
            if(ruleValue.equals(items.get(i).get(idx)))    cnt++;
        return cnt;
    }
}