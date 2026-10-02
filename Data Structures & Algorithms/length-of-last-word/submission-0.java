class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] newStr = s.split(" ");
        return newStr[newStr.length - 1].length();
    }
}