class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        int word_i = 0;
        int abbr_i = 0;

        while(abbr_i < abbr.length()) {
            char c = abbr.charAt(abbr_i);

            if(Character.isDigit(c)) {
                if(c == '0') {
                    return false;
                }
                int num = 0;

                while(abbr_i < abbr.length() && Character.isDigit(abbr.charAt(abbr_i))) {
                    num = num * 10 + (abbr.charAt(abbr_i) - '0');
                    abbr_i++;
                }
                word_i += num;

                if(word_i > word.length()) {
                    return false;
                }
            } else {
                if(word_i == word.length()) {
                    return false;
                }

                char w = word.charAt(word_i);

                if(w != c) {
                    return false;
                }

                abbr_i++;
                word_i++;
            }
        }
        return word_i == word.length();
    }
}