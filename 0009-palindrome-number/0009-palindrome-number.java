class Solution {
    public boolean isPalindrome(int x) {
        int lastDigit, newNum = 0;
        int original = x;

        if (x < 0){
            return false;
        }
        while(x != 0){
            lastDigit = x % 10;
            x = x / 10;
            newNum = newNum * 10 + lastDigit;
        }
        if(original == newNum){
            return true;
        }
        return false;
    }
}