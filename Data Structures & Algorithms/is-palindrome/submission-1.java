class Solution {
    public boolean isPalindrome(String str) {

        String newStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

         for (int i = 0; i < newStr.length() / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
