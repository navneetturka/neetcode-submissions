class Solution {

    public String encode(List<String> strs) {

        String ans="";
        for(String s:strs){
            ans+=s;
            ans+="~";
        }
        return ans;

    }

    public List<String> decode(String str) {
        ArrayList<String> arr= new ArrayList<>();
        String  ans="";
        for(char ch:str.toCharArray()){
            
            if(ch=='~'){
                arr.add(ans);
                ans="";
            }
            else{
                ans+=ch;
            }
            
        }
        
        return arr ;
    }
}
