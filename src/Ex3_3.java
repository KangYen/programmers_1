import java.util.*;

public class Ex3_3 {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        Ex3_3 a = new Ex3_3();
        System.out.println(a.solution(69375));
    }
}
