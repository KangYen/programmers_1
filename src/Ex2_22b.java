/*함수 solution은 정수 x와 자연수 n을 입력 받아,
        x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
        다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Ex2_22b {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();

        for (long i = 1; i <= n; i++){
            list.add((long)x * i);
        }

        long[] arr = new long[list.size()];

        for(int j = 0; j < list.size(); j++) {
            arr[j] = list.get(j);
        }
        return arr;
    }

    public static void main(String[] args) {
        int x = 0;
        int n = 0;
        Ex2_22b a = new Ex2_22b();
        long[] answer = a.solution(3,9);
        System.out.println(Arrays.toString(answer));
    }
}
