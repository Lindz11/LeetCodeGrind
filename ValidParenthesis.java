class Solution {
    public boolean isValid(String s) {
        // Solution: 0(n) 
        // I think that I can use a stack to solve this problem
        Stack<Character> q = new Stack<>();

        for(Character c: s.toCharArray()) {
            if(!q.isEmpty() && c == ')' && q.peek() == '(' )
                q.pop();
            else if(!q.isEmpty() && c == ']' && q.peek() == '[')
                q.pop();
            else if(!q.isEmpty() && c == '}' && q.peek() == '{')
                q.pop();
            else
                q.push(c); 
        }

        if(q.isEmpty())
            return true; 
        return false; 
    }
}
