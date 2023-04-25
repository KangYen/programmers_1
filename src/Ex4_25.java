/*하샤드수*/

public class Ex4_25 {
    public boolean solution(int x) {
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }
        if (x % sum ==0) {
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        Ex4_25 a = new Ex4_25();
        System.out.println(a.solution(10));
    }
}
