class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }

        for(int num : frequencyMap.keySet()){
            int frequency = frequencyMap.get(num);

            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        int count = 0;
        int[] answer = new int[k];

        for(int i = buckets.length - 1; i >= 0 && count < k; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    answer[count] = num;
                    count++;
                }
            }
        }

        return answer;
    }
}
