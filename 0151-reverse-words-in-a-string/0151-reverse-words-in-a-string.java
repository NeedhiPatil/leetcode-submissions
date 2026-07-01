class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        int p = s.length() - 1;
        while(p>=0){
            while(p >= 0 && s.charAt(p) == ' '){
                p--;
            }

            if(p<0) break;

            int end = p;
            while(p >= 0 && s.charAt(p) != ' '){
                p--;
            }

            String word = s.substring(p+1, end+1);

            if(result.length() > 0){
                result.append(" ");
            }   

            result.append(word); 
        }
        return result.toString();
    }
}