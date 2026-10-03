class Solution {
    public int countSeniors(String[] details) {
        int total = 0;

        for(String s: details) {
            String age = s.substring(11, 13);
            if(Integer.parseInt(age) > 60) {
                total++;
            }
        }

        return total;
    }
}