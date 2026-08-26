class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

       for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = nums.length; i > 0; i--) {
            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if (entry.getValue() == i) {
                    list.add(entry.getKey());
                    if(list.size() == k) break;
                }
            }
            if(list.size() == k) break;
        }

        int[] output = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }

        return output;
    }
}
