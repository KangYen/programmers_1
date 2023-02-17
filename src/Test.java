class Test {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("t.solution(6) = " + t.solution(6));
    }
}
