class Solution {
    // Spent majority of the time looking to see how to sort a print out the information in the priority queue
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : nums) {
            freq.put(i , freq.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()) {
            maxHeap.add(entry);
        }

        int [] ans = new int[k];
        // I need to retrieve onl the keyset 
        for(int i = 0; i < k; i++) { 
            ans[i] = maxHeap.poll().getKey();
        }
        return ans;
    }
}
