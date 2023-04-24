public class Ex4_24b {
    public int solution(int n) {
        int answer = 2;

        while(true) {
            if (n%answer==1) break;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex4_24b b = new Ex4_24b();
        System.out.println(b.solution(33));
    }
}
