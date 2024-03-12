class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        builder.reverse();
        return number.equals(builder.toString());
    }
}