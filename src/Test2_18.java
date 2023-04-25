
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class Test2_18 {
    public int[] solution(long n) {
        String s = ""+n;
        int[] answer = new int[s.length()];
        int a = 0;
        while(n>0) {
            answer[a]=(int)(n%10);
            n/=10;
            a++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Test2_18 a = new Test2_18();
        System.out.println(a.solution(12345));
    }
}
