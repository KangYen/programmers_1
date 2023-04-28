/*두 정수 사이의 합*/

public class Ex4_28 {
    public long solution(int a, int b ) {
        long answer = 0;

        if(a < b) {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        } else if(a > b){
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            answer = a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex4_28 a = new Ex4_28();
        System.out.println(a.solution(7,9));
    }
}
