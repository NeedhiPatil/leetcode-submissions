class Solution {
    public String largestOddNumber(String s) {
        int odd_ind = -1;
        int len = s.length();
        for(int i = len - 1; i>=0; i--){
            if(s.charAt(i) % 2 == 1){
                odd_ind = i;
                break;
            }
        }

        if(odd_ind == -1){
            return "";
        }

        int i = 0;
        while(i <= odd_ind && s.charAt(i) == '0'){
            i++;
        }
        return s.substring(i, odd_ind + 1);
    }
}