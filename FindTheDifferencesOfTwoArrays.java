class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        HashSet<Integer> f = new HashSet<>();
        for(int a : nums1){
            f.add(a);
        }
        HashSet<Integer> s = new HashSet<>();
        for(int b : nums2){
            s.add(b);
        }

        for(int i: f) {
            if(!s.contains(i)) {
                two.add(i);
            }
        }

        for(int j: s) {
            if(!f.contains(j)) {
                one.add(j);
            }
        }
        ans.add(two);
        ans.add(one); 

        return ans;
    }
}
