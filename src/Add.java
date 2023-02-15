public class Add {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.solution(123));
    }
}
