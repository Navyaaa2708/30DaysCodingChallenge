class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length(); 
        if(n<10) return Collections.emptyList();
        int[] code=new int[26]; 
        code['C'-'A']=1; 
        code['G'-'A']=2; 
        code['T'-'A']=3;
        int mask=(1<<20)-1,h=0; 
        Set<Integer> seen=new HashSet<>(); 
        Set<String> dup=new HashSet<>();
        for(int i=0;i<n;i++){
            h=((h<<2)|code[s.charAt(i)-'A'])&mask; 
            if(i>=9){
                if(!seen.add(h)) dup.add(s.substring(i-9,i+1));
            }
        }
        return new ArrayList<>(dup);
    }
}