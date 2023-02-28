class Ex2_28b {
    public long solution(long n){
        long answer = 0;

        for (long i = 1; i*i <= n; i++) {
            if (i*i == n)
                answer = (i+1)*(i+1);
        }
        return answer == 0 ? -1 : answer;
    }

    public static void main(String[] args) {
        Ex2_28b a = new Ex2_28b();
        System.out.println(a.solution(121));
    }
}
