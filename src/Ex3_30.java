/*자연수 뒤집어 배열로 만들기*/

import java.util.Arrays;

public class Ex3_30 {
   public int[] solution(long n) {
            String str = "" + n; //String에 n 추가
       int[] answer = new int[str.length()];
       int idx= 0;
       while (n>0){
           answer[idx]=(int)(n%10);
           n/=10;
           idx++;
        }
       return answer;
    }

    public static void main(String[] args) {
        Ex3_30 a = new Ex3_30();
        System.out.println(Arrays.toString(a.solution(12345)));
    }
}
