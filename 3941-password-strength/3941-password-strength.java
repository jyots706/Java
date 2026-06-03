class Solution {
    public int passwordStrength(String pass) {
        HashSet<Character> set = new HashSet<>();
        int point = 0;
        for (char ch : pass.toCharArray()) {
            if (set.contains(ch)) {
                continue;
            }
            else {
                set.add(ch);
                if(ch>='a' && ch<='z'){
                    point+=1; // shi krna
                }
                else if(ch>='A' && ch<='Z'){
                    point = point+2;
                }
                else if(ch>='0' && ch<='9'){
                    point=point+3;
                }
                else{
                    point=point+5;
                }  
            }      
        }   
        return point;
    }           
}             