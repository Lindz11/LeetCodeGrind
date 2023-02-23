class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>(); 
        DFSParenthesis(ans, n , n, ""); 
        return ans; 
    }

    public void DFSParenthesis(List<String> ans, int open, int close, String paren) {
        // If both are 0 then we should have a answer that meets the solution
        if(open == 0 && close == 0){
            ans.add(paren); 
            return; 
        }
        // We should try to add as many open parenthesis as possible first
        if(open > 0){
            DFSParenthesis(ans, open - 1, close, paren + '('); 
        }
        // If close is greater than open add a close parenthesis 
        if(close > open) {
            DFSParenthesis(ans, open, close - 1, paren + ')'); 
        }
    }
}
