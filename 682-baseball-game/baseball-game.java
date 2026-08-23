class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();

        for(String x : operations){
            if(x.equals("+")){
                int num1 = Integer.valueOf(stack.pop());
                int num2 = Integer.valueOf(stack.pop());
                Integer res = num1 + num2;
                stack.push(Integer.toString(num2));
                stack.push(Integer.toString(num1));
                stack.push(Integer.toString(res));
            }
            else if(x.equals("D")){
                Integer num1 = Integer.valueOf(stack.peek());
                stack.push(Integer.toString(num1 * 2));
            }else if(x.equals("C")){
                stack.pop();
            }
            else{
                stack.push(x);
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            Integer curr = Integer.valueOf(stack.pop());
            ans = ans + curr;
        }
        return ans;
    }
}