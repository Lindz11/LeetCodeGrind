class Solution {
    public int arraySign(int[] nums) {
        int pos = 0, neg = 0;

        for(int i: nums) {
            if(i == 0)
                return 0;
            else if(i > 0) {
                pos++;
            } 
            else {
                neg++;
            }
        }

        if(neg % 2 == 0)
            return 1;

        return -1;

    }
}
