class Solution {
    public String removeDuplicates(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(!stack.isEmpty() && x == stack.peek()){
                stack.pop();
            }else{
                stack.push(x);
            }
        }

        while(!stack.isEmpty()){
            ans += stack.pop();
        }

        return new StringBuilder(ans).reverse().toString();
    }
}