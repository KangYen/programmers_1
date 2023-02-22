/*함수 solution은 정수 x와 자연수 n을 입력 받아,
 x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
1. 숫자 n개를 지니는 리스트 생성
2. 정수 x부터 시작하는 리스트이므로 0번째 원소의 값을  x로 갱신
3. x씩 증가

*/

import java.util.Arrays;

public class Ex2_22 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i=1; i<n; i++) {
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 0;
        int n = 0;
        Ex2_22 a = new Ex2_22();
        long[] answer = new long[n];
        answer = a.solution(3, 8);
        System.out.println(Arrays.toString(answer));
    }
}
