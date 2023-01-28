class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // A little complex 
        // Solution : 0(n) 
        List<List<Integer>> ans = new ArrayList<>(); 
        List <Integer> num1 = new ArrayList<>();
        List <Integer> num2 = new ArrayList<>(); 
        HashSet<Integer> s1 = new HashSet<>(); 
        HashSet<Integer> s2 = new HashSet<>(); 
        for(int i: nums1) {
            s1.add(i); 
        }
        for(int i: nums2) {
            s2.add(i); 
        }

        for(int a: nums2) {
            if(!s1.contains(a)){
                num2.add(a);
                s1.add(a); 
            }
        }
        for(int b: nums1) {
            if(!s2.contains(b)){
                num1.add(b);
                s2.add(b); 
            }
        }
        ans.add(num1); 
        ans.add(num2); 
        return ans;
    }
}
