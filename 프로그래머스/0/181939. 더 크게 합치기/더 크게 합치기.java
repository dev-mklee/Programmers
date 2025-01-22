class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int num2 = Integer.valueOf(String.valueOf(b) + String.valueOf(a));
        int answer = (num1 >= num2) ? num1 : num2;
        return answer;
    }
}