class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            boolean found = false;
            for(int j = 0; j < words.length; j++) {
                if(i != j && words[j].contains(words[i])) {
                    found = true;
                    break;
                }
            }
            if(found) {
                result.add(words[i]);
            }
        }

        return result;
    }
}