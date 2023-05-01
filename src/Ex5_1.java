/*콜라츠 추측*/

class Ex5_1 {
    public int solution(long num) {
        int answer = 0;

        while (num != 1) {
            if(num % 2 == 0)
                num /= 2;
            else
                num = num * 3 + 1;
            answer++;

            if (answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex5_1 a = new Ex5_1();
        System.out.println(a.solution(6));
    }
}
