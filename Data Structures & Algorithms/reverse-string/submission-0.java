class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] result = new char[n];

        for(int i = 0; i < n / 2; i++) {
            
            if(s[i] != s[n - i - 1]) {
                char temp = s[n - i - 1];
                s[n - i - 1] = s[i];
                s[i] = temp;
            }
        }
    }
}
