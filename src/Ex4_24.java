/*나머지가 1이 되는 수 찾기*/

public class Ex4_24 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i<n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex4_24 a = new Ex4_24();
        System.out.println(a.solution(33));
    }
}
