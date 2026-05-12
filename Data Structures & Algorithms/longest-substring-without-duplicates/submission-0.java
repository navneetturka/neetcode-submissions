class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")||s.length()==1) return 1;
        int i=0;
        int j=0;
        int maxlen=0;
        
        HashSet<Character> result=new HashSet<>();
        while(i<s.length() && j<s.length()){
            boolean ans=result.contains(s.charAt(j));
            if(!ans){
                result.add(s.charAt(j));
                maxlen=Math.max(maxlen,j-i+1);
                j++;
            }
            else{
                result.remove(s.charAt(i));
                i++;
            }
        }

        return maxlen;
    }
}