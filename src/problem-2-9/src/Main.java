class Solution {
    public boolean isPalindrome(int x) {
        String numString = String.valueOf(x);
        int left = 0;
        int right = numString.length()-1;
        while(left < right) {
            if(numString.charAt(left) !=numString.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }

            }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(x);
        System.out.println("Result: " + result);
    }
}