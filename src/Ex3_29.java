public class Ex3_29 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex3_29 a = new Ex3_29();
        System.out.println(a.solution(10));
    }
}
