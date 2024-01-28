class Solution {
    public int maxNumberOfBalloons(String text) {
        // b a l l o o n
        int [] balloon = new int [5];
        int min = Integer.MAX_VALUE;
        for(Character c: text.toCharArray()) {
            if ( c == 'b') {
                balloon[0]++;
            }
            if ( c == 'a') {
                balloon[1]++;
            }
            if ( c == 'l') {
                balloon[2]++;
            }
            if ( c == 'o') {
                balloon[3]++;
            }
            if (c == 'n')
            {
                balloon[4]++;
            }
        }
        // Make sure to cut all the o's and l's in half
        balloon[3] = balloon[3] / 2;
        balloon[2] = balloon[2] / 2;
        for(int i = 0; i < 5; i++ ) {
            min = Math.min(min, balloon[i]);
        }

        return min;

    }
}
