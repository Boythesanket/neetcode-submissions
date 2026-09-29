class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int num : nums) {
            map.putIfAbsent(num, new ArrayList<>());
            map.get(num).add(num);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = nums.length; i > 0; i--) {
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                if (entry.getValue().size() == i) {
                    list.add(entry.getKey());
                    if(list.size() == k) break;
                }
            }
            if(list.size() == k) break;
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
