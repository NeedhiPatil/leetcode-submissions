class Solution {

    public int square(int n){
        int digit, sum = 0;
        while(n != 0){
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        
        HashSet<Integer> seen = new HashSet<>();

        while(n != 1){
            if(seen.contains(n)){
                return false;
            }

            seen.add(n);

            n = square(n);
        }
        return true;
    }
}