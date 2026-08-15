class Solution {
    public boolean isValid(String s) {

        Stack<Character> chars = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                chars.push(c);
            }else if (c == ')' || c == ']' || c == '}'){
                if(chars.isEmpty()){
                    return false;
                }
                if(c == ')' && chars.peek() == '(' || c == ']' && chars.peek() == '[' 
                || c == '}' && chars.peek() == '{'){
                    chars.pop();
                }else{
                    return false;
                }
            }
        }

        if(chars.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}